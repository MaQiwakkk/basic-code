package com.itzzq.homework;

public class Homework5Case1 {
    public static void main(String[] args) {
        String str1 = "上海自来水来自海上";
        String str2 = "abcdef";
        if (isSymmetric(str1)) {
            System.out.printf("%s是对称的字符串", str1);
        } else {
            System.out.printf("%s不不不不不是对称的字符串", str1);
        }


    }

    public static boolean isSymmetric(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
