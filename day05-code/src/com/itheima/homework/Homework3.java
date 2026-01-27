package com.itheima.homework;

import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
