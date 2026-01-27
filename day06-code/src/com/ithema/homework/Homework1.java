package com.ithema.homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int min = getMin(n1, n2);
        System.out.println(min);
    }

    public static int getMin(int num1, int num2) {
        int min = num1 < num2 ? num1 : num2;
        return min;
    }
}
