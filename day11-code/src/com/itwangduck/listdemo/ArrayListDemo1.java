package com.itwangduck.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //ArrayList<E> list=new ArrayList<E>();
        // ArrayList<E> list=new ArrayList<>();
        // E是泛型 不可以是基本数据类型

        //此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内容,类似于String、Stringbuilder
        //在展示的时候会拿 [] 把所有的数据进行包裹
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
