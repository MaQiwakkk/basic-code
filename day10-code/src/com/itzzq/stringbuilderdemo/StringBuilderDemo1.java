package com.itzzq.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建一个StringBuilder对象sb
        StringBuilder sb = new StringBuilder();
        //2.添加元素，append方法
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append(23);
        sb.append('男');
        System.out.println(sb);//StringBuilder是Java已经写好的类
                               // java在底层对他做了一些特殊处理，
                               //一般来说引用数据类型对象名打印出来是地址句柄
                               //但sb打印出来不是地址值而是属性值。

        //3.反转方法
        sb.reverse();
        System.out.println(sb);

        //4.获取长度方法
        int len  = sb.length();
        System.out.println("sb的长度是"+len);

        //5.让StringBuilder容器池返回一个真正的字符串
        String str = sb.toString();
        System.out.println(str);//str就是一个真正的字符串了
    }
}
