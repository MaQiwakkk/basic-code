package com.itwdk.lambdacode;

import java.util.Arrays;

public class LambdaDemo4 {
    public static void main(String[] args) {
        /*
        定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        要求：
        按照字符串的长度进行排序，短的在前面，长的在后面。
        （暂时不比较字符串里面的内容）
        */

        String[] arr = {"a", "aaaa", "aaa", "aa"};

        // 1. 利用匿名内部类进行书写
        // 这里的目标类型是 Comparator<String>
        // o1表示无序序列中的元素，
        // o2表示有序序列中的元素

        /*
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 字符串长度相减：
                // 如果 o1.length() 小，结果为负数，o1排前面（升序）
                return o1.length() - o2.length();
            }
        });
        */


        // 2. 利用 Lambda 表达式的标准格式进行书写
        // 省略了：new Comparator、方法名、参数类型（String）
        /*
        Arrays.sort(arr,
                (o1, o2) -> {
                    return o1.length() - o2.length();
                }
        );
        */

        // 3. 利用 Lambda 表达式的省略规则进行极致简化
        // 规则：方法体只有一行，可以省略大括号、分号、return
        // 这也是实际开发中最常用的写代码方式，一行搞定！
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        // 打印排序后的数组
        // 预期结果：[a, aa, aaa, aaaa]
        System.out.println(Arrays.toString(arr));
    }
}