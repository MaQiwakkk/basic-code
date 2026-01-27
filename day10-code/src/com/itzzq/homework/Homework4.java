package com.itzzq.homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialStr = sc.nextLine();
        String str = initialStr.toLowerCase();
        int number = 0;
        int letters = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                letters++;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                number++;
            }
        }
        System.out.printf("%s中字母：%d个，数字：%d个.", initialStr, letters, number);
    }
}
