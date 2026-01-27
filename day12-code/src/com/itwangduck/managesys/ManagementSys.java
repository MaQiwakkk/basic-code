package com.itwangduck.managesys;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManagementSys {
    static ArrayList<User> userList = new ArrayList<>();
    static{
        //静态代码块预储存3条信息
        User u1 = new User("tj2531754", "zzqq11qq", "330483200210160033", "18506710516");
        User u2 = new User("tj2531788", "12345678", "330483200210160088", "15251991175");
        User u3 = new User("tj2531799", "66666666", "330483200210160099", "17262991199");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 按其他任意按键退出");

            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    login(userList);
                    break;
                case "2":
                    register(userList);
                    break;
                case "3":
                    forgetPassword(userList);
                    break;
                default:
                    System.out.println("系统已退出");
                    return;
            }
        }
    }

    //用户登录方法
    public static void login(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String userName = sc.next();

        System.out.println("请输入密码");
        String password = sc.next();


        String verifycode = verifyCode();//获取一个验证码并展示
        System.out.printf("收到一条短信 ,您的验证码为%s:\n", verifycode);

        System.out.println("请输入验证码：");
        String myVerifycode = sc.next();

        //用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
        //如果用户名存在 index获取了用户名对应的索引
        int index = getIndex(userList, userName);
        if (index == -1) {
            System.out.println("用户名未注册，请先注册！");
            return;
        }

        //判断验证码是否正确，如不正确，重新输入
        while (true) {
            if (verifycode.equals(myVerifycode)) {
                break;
            }
            System.out.println("请重新输入验证码：");
            myVerifycode = sc.next();
        }

        //判断用户名和密码是否正确，有3次机会
        for (int i = 0; i < 2; i++) {
            if (userList.get(index).getPassword().equals(password)) {
                System.out.println("登录成功！");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.printf("请重新输入密码，还有%d次机会：\n", 2 - i);
                password = sc.next();
            }
            if ((i == 1) && !(userList.get(index).getPassword().equals(password))) {
                System.out.println("3次机会用完，登录失败，返回主界面");
            }
        }
    }

    //用户注册方法
    public static void register(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);

        String userName = null;
        while (true) {
            System.out.println("请输入用户名:");
            userName = sc.next();
            //为true表示用户名合法
            if (verifyUserName(userList, userName)) {
                break;
            }
        }

        String password = null;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            //为true表示密码校验通过
            if (verifyPassword(password)) {
                break;
            }
        }

        String personId = null;
        while (true) {
            System.out.println("请输入身份证号码");
            personId = sc.next();
            if (verifyPersonId(personId)) {
                break;
            }
        }

        String phoneNumber = null;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            if (verifyPhoneNumber(phoneNumber)) {
                break;
            }
        }

        User u = new User(userName, password, personId, phoneNumber);
        userList.add(u);
        System.out.println("注册成功！");
        showAllInfo(userList);
    }

    public static void forgetPassword(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String userName = sc.next();


        //用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
        //如果用户名存在 index获取了用户名对应的索引
        int index = getIndex(userList, userName);
        if (index == -1) {
            System.out.println("用户名未注册，请先注册！");
            return;
        }


        System.out.println("请输入身份证号码");
        String personId = sc.next();

        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        boolean personIdFlag = userList.get(index).getPersonId().equals(personId);
        boolean phoneNumberFlag =userList.get(index).getPhoneNumber().equals(phoneNumber);
        if (personIdFlag && phoneNumberFlag) {
            //如果一致，则提示输入密码，进行修改。
            System.out.println("请输入新密码：");
            String password = sc.next();
            userList.get(index).setPassword(password);
        }else{
            System.out.println("账号信息不匹配，修改失败。");
        }

    }

    //得到输入的用户名对应的索引，不存在就返回-1
    public static int getIndex(ArrayList<User> userList, String userName) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    //注册进行用户名校验
    public static boolean verifyUserName(ArrayList<User> userList, String userName) {
        //前置非空校验
        if (userName == null || userName.trim().isEmpty()) {
            System.out.println("用户名不能为空！");
            return false;
        }
        //验证用户名唯一性
        int index = getIndex(userList, userName);
        if (index >= 0) {
            System.out.println("用户名已存在！");
            return false;
        }

        //验证用户名长度
        if (userName.length() < 3 || userName.length() > 15) {
            System.out.println("您的用户名长度不在3~15位之间！ ");
            return false;
        }

        //验证用用户名是否含有非合法字符
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                System.out.println("用户名只能是字母加数字的组合!");
                return false;
            }
        }

        //验证用户名是否只含有数字
        int letterCount = 0;
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letterCount++;
            }
        }
        if (letterCount == 0) {
            System.out.println("用户名不能是纯数字");
            return false;
        }

        //执行到这一步说明用户名可用
        return true;
    }

    //注册进行密码校验
    public static boolean verifyPassword(String password) {
        System.out.println("请确认密码");
        Scanner sc = new Scanner(System.in);
        String password1 = sc.next();
        if (password1.equals(password)) {
            return true;
        }
        System.out.println("两次密码输入不一致！");
        return false;
    }

    //注册进行身份证校验
    public static boolean verifyPersonId(String personId) {
        //身份证长度校验
        if (personId.length() != 18) {
            System.out.println("身份证长度应为18！");
            return false;
        }

        //开头不为0校验
        if (personId.charAt(0) == '0') {
            System.out.println("身份证不能以0为开头！");
            return false;
        }

        //前17位是数字校验
        for (int i = 0; i < personId.length() - 1; i++) {
            if (personId.charAt(i) < '0' || personId.charAt(i) > '9') {
                System.out.println("身份证前17位，必须都是数字！");
                return false;
            }
        }

        //最后一位的校验
        char c = personId.charAt(17);
        if (!((c >= '0' && c <= '9') || c == 'x' || c == 'X')) {
            System.out.println("身份证最后一位只能是数字、X、x！");
            return false;
        }
        return true;
    }

    //注册进行手机号校验
    public static boolean verifyPhoneNumber(String phoneNumber) {
        //长度为11位校验
        if (phoneNumber.length() != 11) {
            System.out.println("手机号长度应为11！");
            return false;
        }

        //不能以0为开头校验
        if (phoneNumber.charAt(0) == '0') {
            System.out.println("手机号不能以0为开头！");
            return false;
        }

        //必须都是数字校验
        for (int i = 0; i < phoneNumber.length() ; i++) {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                System.out.println("手机号必须都是数字！");
                return false;
            }
        }
        return true;
    }

    //展示所有用户信息
    public static void showAllInfo(ArrayList<User> userList) {
        if (userList.size() == 0) {
            System.out.println("当前无用户信息，请添加后再查询");
            return;
        }

        System.out.println("=========================================");
        System.out.println("用户名\t密码\t身份证号\t手机号");
        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);
            System.out.println(u.getUserName() + "\t " + u.getPassword() + "\t " + u.getPersonId() + "\t " + u.getPhoneNumber());
        }
        System.out.println("=========================================");
    }

    //生成验证码并返回
    public static String verifyCode() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        //添加1位数字
        sb.append(r.nextInt(10));
        //添加4位大小写随机字母
        for (int i = 0; i < 4; i++) {
            char start = r.nextInt(2) == 0 ? 'a' : 'A';  // 0→小写，1→大写（用三元运算符代替if-else）
            char c = (char) (r.nextInt(26) + start);
            sb.append(c);
        }
        String result = Shuffler(sb.toString());
        return result;
    }

    // Fisher-Yates 洗牌算法
    public static String Shuffler(String str) {
        char[] arr = str.toCharArray();

        Random r = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String strNew = new String(arr);
        return strNew;
    }
}

