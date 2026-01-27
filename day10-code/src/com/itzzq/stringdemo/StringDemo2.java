package com.itzzq.stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "Abc";
        Scanner  sc = new Scanner(System.in);
        String s4  = sc.next();//s4是用Scanner来new出来的，不在字符串常量池里 所以用 == 判断是false


        System.out.println(s1 == s2);
        System.out.println(s2 == s4);

        //equals方法：比较字符串对象中的内容是否相等
        boolean flag1 = s1.equals(s2);
        System.out.println(flag1);

        //equalsIgnoreCase方法：略大小写 比较字符串对象中的内容是否相等
        boolean flag2 = s1.equalsIgnoreCase(s3);
        System.out.println(flag2);
    }
}
