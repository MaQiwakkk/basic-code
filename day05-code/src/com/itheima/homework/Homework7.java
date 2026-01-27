package com.itheima.homework;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4, 5};
        int[] brr = new int[arr.length];
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odd++;
            }
        }

        for (int i = 0, j = 0 ,k = odd; i < arr.length; ) {
            if (arr[i] % 2 == 1) {
                brr[j] = arr[i];
                i++;
                j++;
            } else {
                brr[k] = arr[i];
                i++;
                k++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}