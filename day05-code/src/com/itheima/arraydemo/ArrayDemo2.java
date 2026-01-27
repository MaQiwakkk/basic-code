package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //访问数组的元素
        //格式：数组名[索引]
        int arr[] = {1, 2, 3, 4, 5};
        int number = arr[0];
        System.out.println(number);
        System.out.println(arr[4]);

        //给数组元素赋值
        //格式：数组名[索引]=具体数据或变量
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
