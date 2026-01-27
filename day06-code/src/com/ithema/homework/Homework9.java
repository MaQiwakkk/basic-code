package com.ithema.homework;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 7, 7, 7, 8, 8, 8, 8};
        int newLength = 7;
        System.out.println(Arrays.toString(copyOf(arr, newLength)));
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] brr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
