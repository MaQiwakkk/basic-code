package com.ithema.homework;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        int[] arr = {5,5,5,7,7,7,8,8,8,8};
        int fromIndex = 3;
        int toIndex  = 6;
        int value = 666;
        fill(arr,fromIndex,toIndex,value);
        System.out.println(Arrays.toString(arr));
    }

    public static void fill(int[] arr,int fromIndex,int toIndex,int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
    }
}
