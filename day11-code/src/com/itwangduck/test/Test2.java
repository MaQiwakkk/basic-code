package com.itwangduck.test;

import java.util.ArrayList;

public class Test2 {
    //定义一个集合，添加数字 要变成包装类
    /*
        基本数据类型的包装类如下
        byte        Byte
        short       Short
        char        Character
        int         Integer
        long        Long
        float       Float
        double      Double
        boolean     Boolean
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
    }
}
