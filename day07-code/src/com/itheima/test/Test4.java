package com.itheima.test;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 4};
        int[] brr = copyPaste(arr);
        System.out.println(Arrays.toString(brr));

    }

    public static int[] copyPaste(int[] arr) {
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
