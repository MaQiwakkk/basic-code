package com.itzzq.homework;

public class Homework5Case2 {
    public static void main(String[] args) {
        String str1 = "上海自来水来自海上";
        String str2 = "abcdef";
        if (isSymmetric(str2)) {
            System.out.printf("%s是对称的字符串", str2);
        } else {
            System.out.printf("%s不不不不不是对称的字符串", str2);
        }


    }

    public static boolean isSymmetric(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverseSb = new StringBuilder(sb).reverse();;
        return sb.equals(reverseSb);
    }
}