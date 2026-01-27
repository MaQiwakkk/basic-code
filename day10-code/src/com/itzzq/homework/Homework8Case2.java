package com.itzzq.homework;

public class Homework8Case2 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;
        int lastIndex = 0; // 记录下一次开始查找的位置

        while ((lastIndex = str.indexOf("Java", lastIndex)) != -1) {// 使用 indexOf(String str, int fromIndex)的重载方法
            count++;
            lastIndex += "Java".length();

        }
        System.out.println(count);
    }
}
