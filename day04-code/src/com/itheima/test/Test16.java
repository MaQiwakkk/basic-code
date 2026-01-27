package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        //统计start-en
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("起始数字");
        int start = sc.nextInt();
        System.out.println("终结数字");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += 1;
            }

        }
        System.out.println("总共有" + sum + "个");
    }
}
