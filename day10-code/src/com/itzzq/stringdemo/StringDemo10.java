package com.itzzq.stringdemo;
//substring 方法
public class StringDemo10 {
    public static void main(String[] args) {
        String phoneNumber = "15251991157";
        System.out.println(phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7));
    }
}
