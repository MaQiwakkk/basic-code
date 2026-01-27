package com.itheima.test;

//变量的作用域在一个{}之内

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("最终数字");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
