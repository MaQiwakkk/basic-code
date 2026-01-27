package com.itheima.homework1;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("顾客类别（0表示普通顾客，1表示会员）");
        int type = sc.nextInt();
        System.out.println("购物的折前金额（整数即可）");
        int money = sc.nextInt();
        double result = 0;
        if (type == 0) {
            result = money <= 100 ? money : money * 0.9;
        } else if (type == 1) {
            result = money <= 200 ? money*0.8 : money * 0.75;
        } else {
            System.out.println("你输入的会员类型不正确！");
        }
        System.out.println("你需要支付："+result);
    }
}
