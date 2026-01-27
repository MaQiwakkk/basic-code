package com.itzzq.homework;

public class Homework8Case1 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;
        while (str.indexOf("Java") != -1) {
            int index = str.indexOf("Java");
            str = str.substring(index + 4);
            count++;
        }
        System.out.println(count);
    }
}
