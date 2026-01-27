package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;//1-100闭区间的整数
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        System.out.println("guess what is the number");
        int count = 0;
        while (true) {
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜对了");
                break;
            }
            count++;
            if (count == 3) {
                System.out.println("但是大保底！");
                break;
            }
        }
    }
}
