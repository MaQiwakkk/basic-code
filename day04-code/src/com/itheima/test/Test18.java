package com.itheima.test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        /*需求:给你一个整数x。
        如果 x是一个回文熬数，打印 true ，否则，返回 false。
        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数。
        例如，121 是回文，而123不是。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();
        int inil = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        if (num == inil){
            System.out.println("你输入了一个回文数");
        }else{
            System.out.println("你输入的不是回文数");
        }
    }
}
