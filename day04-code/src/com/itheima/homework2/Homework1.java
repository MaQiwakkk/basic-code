package com.itheima.homework2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一个数");
        int number1 = sc.nextInt();
        System.out.print("第二个数");
        int number2 = sc.nextInt();
        System.out.print("要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)");
        int type = sc.nextInt();

        switch (type) {
            case 1 -> System.out.println(number1 + "+" + number2 + "=" +(number1 + number2));
            case 2 -> System.out.println(number1 + "-" + number2 + "=" +(number1 - number2));
            case 3 -> System.out.println(number1 + "*" + number2 + "=" +(number1 * number2));
            case 4 -> System.out.println(number1 + "/" + number2 + "=" +(number1 / number2));
        }

    }
}
