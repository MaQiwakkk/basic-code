package com.itzzq.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string:");
        String str = sc.next();

        String result = new StringBuilder(str).reverse().toString();//链式编程法则
        if(str.equals(result)){
            System.out.println("是对称的");
        }else{
            System.out.println("不是对称的");
        }
    }
}
