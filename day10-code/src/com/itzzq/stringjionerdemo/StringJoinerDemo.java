package com.itzzq.stringjionerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        //StringJoiner容器适合需要指定开始标记，结束标记，间隔符的字符串拼接
        StringJoiner sj = new StringJoiner("--","[","]");
        String str = sj.add("aaa").add("bbb").add("ccc").toString();
        System.out.println(str);
    }
}
