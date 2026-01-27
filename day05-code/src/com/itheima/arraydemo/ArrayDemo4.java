package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //数组的动态初始化:
        //数据类型[]数组名= new 数类型[数组的长度];
        //在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
        //数组默认初始化值 整型就是0 小数就是0.0 字符就是'\u0000'即空格 布尔就是false 引用数据类型就是null
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
