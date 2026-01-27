package com.itheima.homework1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int minNumber = number1<number2 ? number1:number2;;
        minNumber = minNumber<number3? minNumber:number3;
        System.out.println(minNumber);
    }
}
