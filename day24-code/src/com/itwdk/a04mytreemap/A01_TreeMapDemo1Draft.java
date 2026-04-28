package com.itwdk.a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1Draft {
    public static void main(String[] args) {
        /*
           TreeMap集合：基本应用
            需求1：
                键：整数表示id
	            值：字符串表示商品名称
	            要求1：按照id的升序排列(默认就是升序)
	            要求2：按照id的降序排列
         */

        // 创建TreeMap时就要指定排序方法
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm.put(2, "康帅傅");
        tm.put(5, "可恰可乐");
        tm.put(4, "雷碧");
        tm.put(1, "粤利粤");
        tm.put(3, "九个核桃");

        System.out.println(tm);
    }
}
