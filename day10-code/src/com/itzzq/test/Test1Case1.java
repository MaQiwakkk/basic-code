package com.itzzq.test;

import java.util.Scanner;

public class Test1Case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("please input:");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("please input again!");
                //continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeroman(number);
            sb.append(s).append(" ");
        }
        System.out.println(sb);

    }


    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }

    public static String changeroman(int number) {
        String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanNumerals[number];
    }
}
