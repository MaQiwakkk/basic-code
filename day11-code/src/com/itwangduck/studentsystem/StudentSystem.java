package com.itwangduck.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Student> studentList = new ArrayList<>();
        Student student = new Student("1", "王大可", 23, "友园16");
        Student student1 = new Student("2", "钱粮", 23, "友园16");
        Student student2 = new Student("3", "石佳段彤", 22, "友园15");
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        while (flag) {
            System.out.println("-----------------------------------------");
            System.out.println("-----------欢迎使用学生管理系统-----------");
            System.out.println("-----------------------------------------");
            System.out.println("按“1”：添加学生");
            System.out.println("按“2”：删除学生");
            System.out.println("按“3”：修改学生");
            System.out.println("按“4”：查询单个学生信息");
            System.out.println("按“5”：展示所有学生信息");
            System.out.println("按任意其他按键：退出系统");

            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            switch (choice) {
                case "1":
                    addStudent(studentList);
                    break;
                case "2":
                    deleteStudent(studentList);
                    break;
                case "3":
                    updateStudent(studentList);
                    break;
                case "4":
                    showSingleInfo(studentList);
                    break;
                case "5":
                    showAllInfo(studentList);
                    break;
                default:
                    System.out.println("系统已退出");
                    flag = false;
                    break;
            }
        }
        showAllInfo(studentList);
    }


    //添加学生的的方法
    public static void addStudent(ArrayList<Student> studentList) {
        Student std = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;

        while (true) {
            System.out.println("请输入id：");
            id = sc.next();
            boolean flag = ifContains(studentList, id);
            if (flag) {
                //表示id已经存在，需要重新输入
                System.out.println("id已经存在，需要重新输入");
            } else {
                std.setId(id);
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.next();
        std.setName(name);

        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        std.setAge(age);

        System.out.println("请输入家庭住址：");
        String address = sc.next();
        std.setAddress(address);

        studentList.add(std);
        System.out.println("学生信息添加成功");
    }

    //删除学生的方法
    public static void deleteStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除学生的id：");
        String id = sc.next();

        int index = getIndex(studentList, id);

        if (index >= 0) {
            studentList.remove(index);
            System.out.printf("id为%d的学生删除成功\n", index);
            showAllInfo(studentList);
        } else {
            System.out.println("你想要删除的学生id不存在，现在将回到初始菜单!");
        }
    }

    //修改学生的方法
    public static void updateStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的学生的id：");
        String id = sc.next();

        int index = getIndex(studentList, id);
        if (index == -1) {
            System.out.printf("id为%s的学生不存在\n", id);
            return;//不存在直接结束方法
        }

        //修改
        System.out.println("请输入修改后姓名：");
        String name = sc.next();
        System.out.println("请输入修改后年龄：");
        int age = sc.nextInt();
        System.out.println("请输入修改后家庭住址：");
        String address = sc.next();
        //创建一个临时新对象
        Student std = new Student();
        std.setId(id);
        std.setName(name);
        std.setAge(age);
        std.setAddress(address);
        //将临时新对象按索引i位置覆盖原数据
        studentList.set(index, std);

        System.out.println("修改成功");
        showAllInfo(studentList);

    }

    //展示所有学生信息
    public static void showAllInfo(ArrayList<Student> studentList) {
        if (studentList.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("=========================================");
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < studentList.size(); i++) {
            Student std = studentList.get(i);
            System.out.println(std.getId() + "\t " + std.getName() + "\t " + std.getAge() + "\t " + std.getAddress());
        }
        System.out.println("=========================================");
    }

    //展示单个学生信息
    public static void showSingleInfo(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的学生的id：");
        String id = sc.next();

        int index = getIndex(studentList, id);
        if (index == -1) {
            System.out.printf("id为%s的学生不存在\n", id);
            return;//不存在直接结束方法
        }

        Student std = studentList.get(index);
        System.out.println("你要查询的学生的详细信息为：");
        System.out.println(std.getId() + "\t " + std.getName() + "\t " + std.getAge() + "\t " + std.getAddress());
    }

    //判断输入的id对应的学生是否存在
    public static boolean ifContains(ArrayList<Student> studentList, String id) {
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        return getIndex(studentList, id) >= 0;
    }

    //得到输入的id对应的索引，不存在就返回-1
    public static int getIndex(ArrayList<Student> studentList, String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
