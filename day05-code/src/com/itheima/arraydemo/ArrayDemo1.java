package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args){
        //数组的静态初始化
        //完整格式：
        //int [] array1 = new int[]{ element1, element2 }
        //简化格式：
        //int [] array1 = { element1, element2 }
        int[] array1 = new int[]{ 1, 2 };
        int[] array2 = { 3, 4 };

        String[] arr3 = {"zhangsan","lisi","wanghu"};

        double[] arr4 = { 1.1, 2.2 };

        System.out.println(array1);//数组名是地址，将会打印[I@f6f4d33 [表示这是数组 I表示int
    }
}
