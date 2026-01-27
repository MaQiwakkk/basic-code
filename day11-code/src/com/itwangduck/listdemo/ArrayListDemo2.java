package com.itwangduck.listdemo;

import java.util.ArrayList;

/*
成员方法  增删改查
boolean add(E e)        添加

boolean remove(E e)     删除
E remove(int index)

E set(int index,E e)    修改

E get(int index)        查询
int size()              获取长度

*/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //1.添加
        System.out.println("=================添加:");
        boolean result = list.add("aaa");
        System.out.println(result);
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        System.out.println(list);


        //2.直接删除
        System.out.println("=================删除:");
        boolean flag1 = list.remove("ddd");
        boolean flag2 = list.remove("ggg");
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(list);
        //根据索引删除
        list.remove(0);
        System.out.println(list);


        //3.修改
        System.out.println("=================修改:");
        String temp = list.set(0, "666");//修改索引元素 并将被覆盖的元素返回
        System.out.println(list);
        System.out.println(temp);

        //4.查询
        System.out.println("=================查询:");
        String temp1 = list.get(0);
        System.out.println(temp1);
        //4.size()方法获取长度 类似length，可以用来遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("list的第%d个元素是%s\n", i, list.get(i)); //注意要用get方法按索引获取元素
        }

    }
}