package com.itzzq.test;

import java.util.Scanner;
    /*
   这里用switch替换了Test1的罗马数字的字符串数组
   详见下面的changeroman方法
   */
public class Test1Case2 {
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
            String s = changeroman(c);
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

    public static String changeroman(char number) {
        //String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String str;
        switch (number) {
            case '1' -> str = "I";
            case '2' -> str = "II";
            case '3' -> str = "III";
            case '4' -> str = "IV";
            case '5' -> str = "V";
            case '6' -> str = "VI";
            case '7' -> str = "VII";
            case '8' -> str = "VIII";
            case '9' -> str = "IX";
            default -> str = "";
        }
        return str;
    }
}
