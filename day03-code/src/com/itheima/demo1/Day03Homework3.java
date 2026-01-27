package com.itheima.demo1;

public class Day03Homework3 {
    public static void main(String[] args) {
        int pork = 24;
        int peanut = 8;
        int rice = 3;

        double case1 = (pork + peanut + rice) > 30 ? (pork + peanut + rice) * 0.8 : (pork + peanut + rice);
        int case2 = 16 + peanut + rice;
        double result = case1 < case2 ? case1 : case2;
        System.out.println(result);

    }
}
