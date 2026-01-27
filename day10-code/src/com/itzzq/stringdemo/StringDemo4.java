package com.itzzq.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        String RightUserName = "2531754";
        String RightPassword = "zzqq11QQQ!";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String UserName = sc.next();
            System.out.println("请输入密码:");
            String Password = sc.next();
            if (RightUserName.equals(UserName) && RightPassword.equals(Password)) {
                System.out.println("用户登陆成功!");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的账号已被锁定！请联系工作人员！");
                } else {
                    System.out.printf("用户登录失败，你还剩下%d次机会!\n", (2 - i));
                }
            }
        }

    }
}
