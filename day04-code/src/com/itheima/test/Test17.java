package com.itheima.test;

public class Test17 {
    public static void main(String[] args) {
        double paper = 0.1;
        double height = 8844430;
        int count = 0;

        while (paper < height) {
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
