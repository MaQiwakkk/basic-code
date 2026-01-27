package com.itheima.demo1;

public class Day03Homework2 {
    public static void main(String[] args) {
        int blackTea = 21;
        int greenTea = 24;
        boolean result = blackTea *2 + 3 == greenTea * 2;
        System.out.println(result);

        //1.定义红茶妹妹原来的钱
        int red = 21;
        //2.定义绿茶妹妹原来的钱
        int green = 24;
        //3.求红茶妹妹现有的钱
        red = red * 2 + 3;
        //4.求绿茶妹妹现有的钱
        green *= 2;
        //5.判断并输出两个人的钱是否相等
        System.out.println(red == green);
    }
}
