package com.itwangduck.test;


import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("666");
        list.add("777");
        list.add("888");
        list.add("999");
        //遍历 用list.get(i)这个成员方法
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");
    }
}
