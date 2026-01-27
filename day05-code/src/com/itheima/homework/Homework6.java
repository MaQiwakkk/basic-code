package com.itheima.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int index = 0;
        while ( index < arr.length && arr[index] < n) {
            index++;
            //循环条件中，涉及数组索引的判断必须放在前面，要用&&不用&
            //确保不会访问超出范围的索引。这是数组操作中非常重要的细节
            //arr[index] < n && index < arr.length
            //就会报错下标越界（在输入的n大于所有数的情况下）
        }

        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }

        arr1[index] = n;

        for (int i = index + 1; i < arr1.length; i++) {
            arr1[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
