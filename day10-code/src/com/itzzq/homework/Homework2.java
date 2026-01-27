package com.itzzq.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //验证码生成
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char[] arr = str.toCharArray();

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {// 随机交换算法，公平性不好，应该用Fisher-Yates 洗牌算法
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        String strNew = new String(arr);
        System.out.println(str);
        System.out.println(strNew);
    }
}
