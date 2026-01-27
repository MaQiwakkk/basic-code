package com.itheima.test;
//不用 * / % 实现除法和余数功能
public class Test19 {
    public static void main(String[] args) {
        int a = 109;
        int b = 5;
        int shang = 0;
        while (a >= b) {
            shang++;
            a = a - b;
        }
        int yushu = a;
        System.out.println(shang);
        System.out.println(yushu);
    }
}
