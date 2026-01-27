package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (i * i == number) {
                System.out.println(number + "的平方根是" + i);
                break;
            } else if (i * i > number) {
                System.out.println(number + "的平方根的整数部分是" + (i - 1));
                break;
            }

        }
    }
}
