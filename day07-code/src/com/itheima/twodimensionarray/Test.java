package com.itheima.twodimensionarray;

public class Test {
    public static void main(String[] args) {
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        for (int i = 0; i < yearArrArr.length; i++) {
            System.out.println("第" + (i + 1) + "个季度的营业额为：" + getSum(yearArrArr[i]));
        }
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
