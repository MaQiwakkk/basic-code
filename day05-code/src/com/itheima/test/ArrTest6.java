package com.itheima.test;

public class ArrTest6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //另一种方法
        System.out.println("\n");
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0, j = arr1.length-1; i < j; i++, j--) {
            int temp1 = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp1;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
