package com.itheima.switchdemo;

/*
        switch 新特性 ->{}
        JDK12及之后版本可用
 */
public class SwitchDemo4 {
    public static void main(String[] args) {

        int number = 1;
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }
        //用->{}可以不写break;
        //同时只有一行语句的话，可以省略{}
        int number1 = 2;
        switch (number1) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
    }
}
