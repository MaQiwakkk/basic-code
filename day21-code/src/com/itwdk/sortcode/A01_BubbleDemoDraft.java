package com.itwdk.sortcode;

public class A01_BubbleDemoDraft {
    public static void main(String[] args) {
        int[] arr1 = {6, 4, 3, 2, 5, 1};
        myBubbleSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void myBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // 相邻位置比较
                    myExchange(arr, j);
                }
            }
        }
    }

    private static void myExchange(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
