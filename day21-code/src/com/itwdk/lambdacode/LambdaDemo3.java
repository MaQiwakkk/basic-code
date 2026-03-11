package com.itwdk.lambdacode;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
            lambda的省略规则：
                1. 参数类型可以省略不写。
                2. 如果只有一个参数，参数类型可以省略，同时()也可以省略。
                3. 如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。
         */

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        // --- 阶段一：原始匿名内部类写法 ---
        /*
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        */

        // --- 阶段二：Lambda 完整标准写法 ---
        // 根据“目标类型”推导出 Comparator 接口
        /*
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
        */

        // --- 阶段三：利用省略规则进行极致简化 ---
        // 1. 参数类型 Integer 省略不写 (规则1)
        // 2. 方法体只有一行，省略了 { }, 分号, 和 return (规则3)
        Arrays.sort(arr, (o1, o2) -> o1 - o2);


        System.out.println(Arrays.toString(arr));
    }
}
