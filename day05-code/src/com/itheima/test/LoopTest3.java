package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an number:");
        int number = sc.nextInt();
        boolean flag = true;//默认为质数,flag的标记思想
        for (int i = 2; i < number; i++) {  //i <= sqrt(number)的写法可以降低复杂度
            if (number % i == 0) {
                System.out.println("你输入的不是质数");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("你输入的是质数");
        }
    }

}
