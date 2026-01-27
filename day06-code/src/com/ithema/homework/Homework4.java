package com.ithema.homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(getAbs(a));

    }
     public static double getAbs(double num) {
        if (num < 0) {
            num = num*(-1);
        }
        return num;
     }
}
