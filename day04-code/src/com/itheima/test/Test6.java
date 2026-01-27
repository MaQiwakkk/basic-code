package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("自行车");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚");
            } else {
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("分数不符合格式");
        }
    }
}
