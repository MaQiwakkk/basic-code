package com.itheima.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入:
        //第一套体系:
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了

        //第二套体系:
        //nextLine();接收字符串
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        System.out.println(str1);
        String str2 = sc.next();
        System.out.println(str2);

        int num1 = sc.nextInt();
        System.out.println(num1);
        int num2 = sc.nextInt();
        System.out.println(num2);




    }
}

