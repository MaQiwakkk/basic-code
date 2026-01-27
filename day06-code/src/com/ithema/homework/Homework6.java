package com.ithema.homework;

public class Homework6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8, 4, 7};
        int[] arr2 = {1, 4, 6, 8, 4, 0};
        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }
}
