package com.ithema.test;

import java.util.Arrays;

public class Test8 {
    int qqq = 1;

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 4, 0, 2, 4};
        int[] brr = copyOfRange(arr, 3, 5);
        System.out.println(Arrays.toString(brr));
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            brr[index] = arr[i];
            index++;
        }
        return brr;
    }
}
