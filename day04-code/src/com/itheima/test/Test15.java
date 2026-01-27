package com.itheima.test;

//  100.fori  快捷指令
public class Test15 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("所有的偶数和：" + sum);
    }
}
