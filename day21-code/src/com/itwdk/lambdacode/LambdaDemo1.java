package com.itwdk.lambdacode;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        // 初识lambda表达式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });

        System.out.println(Arrays.toString(arr));
    }
}
