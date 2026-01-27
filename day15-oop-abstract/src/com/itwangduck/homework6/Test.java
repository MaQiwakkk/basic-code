package com.itwangduck.homework6;

public class Test {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("匿名内部类实现showB()");
            }
        });
        b.methodB();
    }
}