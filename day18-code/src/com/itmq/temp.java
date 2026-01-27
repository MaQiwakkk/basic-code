package com.itmq;

public class temp {
    public static void main(String[] args) {
        System.out.println("a".matches("[a-z&&[^m-p]]"));
        System.out.println("a-z&&m".matches("a-z&&[^m-p]"));
    }
}
