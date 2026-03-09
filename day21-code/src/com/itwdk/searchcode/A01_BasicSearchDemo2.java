package com.itwdk.searchcode;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{81, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 0 3 8

        int[] arr = {81, 127, 147, 81, 103, 23, 7, 79, 81};
        int key = 81;
        System.out.println(MyBasicSearch(arr, key));
    }

    public static ArrayList<Integer> MyBasicSearch(int[] arr, int number) {
        //利用基本查找来查找number在数组中是否存在
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                indexList.add(i);
            }
        }

        if (indexList.isEmpty()) {
            indexList.add(-1);
        }
        return indexList;
    }
}
