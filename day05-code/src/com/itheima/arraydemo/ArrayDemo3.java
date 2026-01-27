package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        //在java中用 数组名.length 获取数组长度
        int[] arr1 = {1, 2, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //在idea中用 数组名.fori 获取遍历数组
        int[] arr2 = {1, 3, 4, 6, 8, 6, 4, 3, 8, 4, 8, 4, 1, 3, 5, 6, 7, 8};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
