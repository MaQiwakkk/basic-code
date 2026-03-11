package com.itwdk.arrayscode;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        /*
            public static String toString(数组)                      把数组拼接成一个字符串
            public static int binarySearch(数组, 查找的元素)           二分查找法查找元素
            public static int[] copyOf(原数组, 新数组长度)              拷贝数组
            public static int[] copyOfRange(原数组, 起始索引, 结束索引)  拷贝数组（指定范围）
            public static void fill(数组, 元素)                        填充数组
            public static void sort(数组)                            按照默认方式进行数组排序
         */

        // -----------------toString-----------------
        System.out.println("-----------------toString-----------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));


        // -----------------binarySearch-----------------
        // 注意：二分查找的前提是数组必须是有序的！
        System.out.println("-----------------binarySearch-----------------");
        System.out.println(Arrays.binarySearch(arr, 10)); // 查找存在的元素：返回正确的索引 9
        System.out.println(Arrays.binarySearch(arr, 2));  // 查找存在的元素：返回正确的索引 1
        System.out.println(Arrays.binarySearch(arr, 20)); // 查找不存在的元素：返回 -插入点-1


        // -----------------copyOf-----------------
        System.out.println("-----------------copyOf-----------------");
        // 如果新长度大于原数组长度，后面会补默认值（int是0）
        int[] newArr1 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(newArr1));


        // -----------------copyOfRange-----------------
        System.out.println("-----------------copyOfRange-----------------");
        // 注意：包头不包尾，包含起始索引，不包含结束索引
        int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newArr2));


        // -----------------fill-----------------
        System.out.println("-----------------fill-----------------");
        int[] arr3 = new int[5];
        System.out.println("填充前：" + Arrays.toString(arr3)); // [0, 0, 0, 0, 0]
        Arrays.fill(arr3, 100);
        System.out.println("填充后：" + Arrays.toString(arr3)); // [100, 100, 100, 100, 100]


        // -----------------sort-----------------
        System.out.println("-----------------sort-----------------");
        int[] arr4 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        System.out.println("排序前：" + Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println("排序后：" + Arrays.toString(arr4));
    }
}
