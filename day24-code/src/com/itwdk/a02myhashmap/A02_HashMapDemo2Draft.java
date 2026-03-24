package com.itwdk.a02myhashmap;

import java.util.*;

public class A02_HashMapDemo2Draft {
    public static void main(String[] args) {
         /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);


        // 1. 模拟八十个学生投票
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int idx = r.nextInt(4) + 65; // A-D的ASCII码
            char c = (char) (idx);
            String vote = String.valueOf(c);

            method(vote, map);
        }
        // 查看结果
        System.out.println(map);


        // 2. 第一遍遍历：找最大值max
        int max = 0;
        for (Integer value : map.values()) {
            max = value > max ? value : max;
        }


        // 3. 第二遍遍历：打印最大值
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + entry.getValue());
            }
        }


    }

    private static void method(String vote, HashMap<String, Integer> map) {
        Integer num = map.get(vote);
        map.put(vote, num + 1);
    }
}
