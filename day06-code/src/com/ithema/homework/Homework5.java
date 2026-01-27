package com.ithema.homework;

public class Homework5 {
    public static void main(String[] args) {
        int num=79665;
        System.out.print(getDigitCount(num));
    }
    public static int getDigitCount(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }
}
