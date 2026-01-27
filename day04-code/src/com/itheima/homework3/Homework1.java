package com.itheima.homework3;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("录入两个数字表示一个范围");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int start = number1 < number2 ? number1 : number2;
        int end = number1 > number2 ? number1 : number2;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
