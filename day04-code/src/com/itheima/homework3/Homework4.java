package com.itheima.homework3;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        //回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("please input an integer:");
        int n = sc.nextInt();
        int reserve = 0;
        while (n != 0) {
            reserve = n % 10 + reserve * 10;
            n = n / 10;
        }
        System.out.println(reserve);
    }
}
