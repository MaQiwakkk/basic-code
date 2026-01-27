package com.ithema.homework;

public class Homework2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 1;
        int max = getMax(a, b, c);
        System.out.println(max);
    }

    public static int getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
