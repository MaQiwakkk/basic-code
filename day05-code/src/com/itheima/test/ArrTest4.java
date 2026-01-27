package com.itheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println(max);
    }
}
