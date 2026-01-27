package com.itheima.test;

//利用case穿透和->简化代码

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，表示星期：");
        int week = sc.nextInt();

        switch (week) {
            case 1,2,3,4,5->
                System.out.println("工作日");
            case 6,7->
                System.out.println("休息日");
            default->
                System.out.println("输入错误！");

         /*switch (week) {
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
        }*/
        }
    }
}