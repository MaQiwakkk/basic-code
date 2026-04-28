package com.itwdk.a04mytreemap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A03_TreeMapDemo3Draft {
    public static void main(String[] args) {
        /* 需求：
        字符串“aababcabcdabcde”
        请统计字符串中每一个字符出现的次数，并按照以下格式输出
        输出结果：
        a（5）b（4）c（3）d（2）e（1）

            新的统计思想：利用map集合进行统计

          如果题目中没有要求对结果进行排序，默认使用HashMap
          如果题目中要求对结果进行排序，请使用TreeMap

          键：表示要统计的内容
          值：表示次数
        */
        TreeMap<Character, Integer> tm = new TreeMap<>();

        String str = "aababcabcdabcde";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                // 已存在
                tm.put(c, tm.get(c) + 1);
            } else {
                // 不存在
                tm.put(c, 1);
            }
        }

        // 遍历集合，并按照指定的格式进行拼接  a（5）b（4）c（3）d（2）e（1）
        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append("次) ");
            }
        });

        System.out.println(sb);
    }
}

