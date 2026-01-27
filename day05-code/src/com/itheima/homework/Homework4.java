package com.itheima.homework;

public class Homework4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 6};
        int result = 0;


        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[arr.length - i - 1];
        }
        System.out.println(result);

        int result1 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result1 = result1 * 10 + arr[i];
        }
        System.out.println(result1);
    }
}
