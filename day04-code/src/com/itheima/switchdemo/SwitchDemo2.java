package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("number is 1");
                break;
            case 10:
                System.out.println("number is 10");
                break;
            case 20:
                System.out.println("number is 20");
                break;
            default:
                System.out.println("number is an other one");
                break;
        }
    }
}
