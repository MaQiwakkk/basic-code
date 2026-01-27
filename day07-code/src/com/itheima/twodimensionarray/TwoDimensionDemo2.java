package com.itheima.twodimensionarray;

import java.util.Arrays;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*
        二维数组动态初始化格式:
            数据类型[][]数组名 = new 数据类型[m][n];
            m表示这个二维数组，可以存放多少个一维数组
            n表示每一个一维数组，可以存放多少个元素
        */

        int[][] arr1 = new int[3][5];//int类型默为0

        //特殊情况一：
        int[][] arr2 = new int[2][];

        int[] brr1 = {1, 2, 3};
        int[] brr2 = {4, 5, 6, 7};

        arr2[0] = brr1;
        arr2[1] = brr2;

        System.out.println(Arrays.toString(arr2[0]));
        //

        int[][] arr3 = new int[2][3];
        int[] crr1 = {1, 2, 3};
        int[] crr2 = {4, 5, 6, 7};

        arr3[0] = crr1;
        arr3[1] = crr2;
        System.out.println(Arrays.toString(arr3[1]));

    }
}
