package com.itheima.test;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int number = 1234567;
        int temp = number;
        int count = 0;
        count = getCount(temp, count);

        int[] arr = new int[count];
        int index = arr.length - 1;
        while (number != 0) {
            int i = number % 10;
            arr[index--] = i;
            number = number / 10;
            //index--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int getCount(int temp, int count) {
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }
}
