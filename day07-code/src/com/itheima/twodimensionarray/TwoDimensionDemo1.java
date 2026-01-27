package com.itheima.twodimensionarray;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*二维数组的静态初始化、访问元素、遍历。

        二维数组静态初始化格式:
        数据类型[][]数组名 = new 数据类型[][]{{元素1,元素2},{元素1，元素2}};

        简化格式:
        数据类型[][]数组名 ={{元素1,元素2}，{元素1，元素2}};
        */

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9,},
                {10, 11, 12}
        };

        System.out.println(arr[0][2]);
        arr[2][2] = 100;
        System.out.println(arr[0]);//arr[0]是地址句柄[I@f6f4d33
        //二维数组的遍历，ij双循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
