package com.itheima.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5New {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int index = 0;
        for (int j : arr) {
            if (j > n) {
                break;
            }
            index++;
        }
        int[] brr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        for (int i = index + 1; i < brr.length; i++) {
            brr[i] = arr[i - 1];
        }
        brr[index] = n;
        System.out.println(Arrays.toString(brr));
    }
}
