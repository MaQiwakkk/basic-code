package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

public class ArrTest7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp =arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
