package com.itwangduck.homework5_2;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        InterA anonymousA = new InterA(){
            @Override
            public void showA() {
                System.out.println("方式2：匿名内部类实现showA()");
            }
        };
        a.methodA(anonymousA);
    }
}