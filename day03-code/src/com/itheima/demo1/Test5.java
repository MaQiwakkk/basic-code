package com.itheima.demo1;

public class Test5 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max);
    }
}
