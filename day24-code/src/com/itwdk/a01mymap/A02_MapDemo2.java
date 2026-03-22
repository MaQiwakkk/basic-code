package com.itwdk.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //三个课堂练习：
        //
        //练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历


        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //3.通过键找值

        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //System.out.println(keys.getClass());

        //3.2.1增强for遍历单列集合，得到每一个键
        System.out.println("\n======= 增强for =======");
        for (String key : keys) {
            //System.out.println(key);
            //3.3 利用map集合中的键获取对应的值  get
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //3.2迭代器遍历单列集合，得到每一个键
        System.out.println("\n======= 迭代器 =======");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }


        //3.2匿名内部类遍历单列集合，得到每一个键
        System.out.println("\n======= 匿名内部类 =======");
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                String value = map.get(s);
                System.out.println(s + " = " + value);
            }
        });

        //3.2lambda遍历单列集合，得到每一个键
        System.out.println("\n======= lambda =======");
        keys.forEach(s -> {
            String value = map.get(s);
            System.out.println(s + " = " + value);
        });
    }
}
