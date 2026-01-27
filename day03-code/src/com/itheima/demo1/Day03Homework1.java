package com.itheima.demo1;

public class Day03Homework1 {
    public static void main(String[] args) {
        double fatherHeight = 177;
        double matherHeight = 165;
        double sonHeight = (fatherHeight + matherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight *0.923 + matherHeight)/ 2;
        System.out.println("儿子身高" + sonHeight + "\n" + "女儿身高" + daughterHeight);
    }
}
