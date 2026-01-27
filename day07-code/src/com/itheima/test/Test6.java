package com.itheima.test;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            arr[i] = arr[i] % 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(num);
    }
}
