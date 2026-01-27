package com.itzzq.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 =reverser(str1);
        System.out.println(str2);
    }

    public static String reverser(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
