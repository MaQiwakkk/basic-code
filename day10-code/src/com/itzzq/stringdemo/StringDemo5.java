package com.itzzq.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            System.out.println(ch);
        }
    }
}
