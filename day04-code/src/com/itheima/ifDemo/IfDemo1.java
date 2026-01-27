package com.itheima.ifDemo;

import java.util.Scanner;
/*
 if语句不加花括号{}，只能跟一个“可执行语句”（如打印、赋值等），
 例如int a = 10；的语句不是可执行语句，是一个变量声明语句
*/
public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入酒量");
        int wine= sc.nextInt();

        int a =0;
        if (wine > 2)
            a =100;
            System.out.println("不错");
            System.out.println(a);


    }
}
