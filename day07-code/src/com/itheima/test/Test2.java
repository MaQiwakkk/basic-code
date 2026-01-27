package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            if (isSushu(i)) {
                System.out.println(i + "是素数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个素数");
    }

    public static boolean isSushu(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
