package com.itheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("数据中所有数据的和是" + average);
        System.out.println("他们的平均数是" + average);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println("一共有" + count + "个数字比平均数小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}

