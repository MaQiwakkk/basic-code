package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入vip等级（1、2、3）" );
        int vip = sc.nextInt();
        if (vip == 1) {
            System.out.println("实际的价格是" + price * 0.9);
        } else if (vip == 2) {
            System.out.println("实际的价格是" + price * 0.8);
        } else if (vip == 3) {
            System.out.println("实际的价格是" + price * 0.7);
        } else {
            System.out.println("实际的价格是" + price);
        }
    }
}
