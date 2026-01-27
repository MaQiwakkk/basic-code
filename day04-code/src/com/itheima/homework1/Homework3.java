package com.itheima.homework1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你的存入金额：");
        int money = sc.nextInt();
        System.out.println("你选择存几年（1、2、3、5）：");
        int year = sc.nextInt();
        double result = 0;
        if (year == 1) {
            result = money + money * year * 2.25 / 100;
        } else if (year == 2) {
            result = money + money * year * 2.25 / 100;
        } else if (year == 3) {
            result = money + money * year * 3.25 / 100;
        } else if (year == 5) {
            result = money + money * year * 3.6 / 100;
        } else {
            System.out.println("你输入的存款年份不对！");
        }
        System.out.println(result);
    }
}
