package com.itheima.loopdemo;

public class ForDemo1 {
    public static void main(String[] args) {
        //打印5次Helloworld
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次Helloworld");
            System.out.println('第' + i + "次Helloworld");
        }
    }
}
// for (int i = 1; i <= 5; i++) {}
//等价于
//int i = 1
//for (; i <= 5; i++) {}