package com.itwangduck.a04innerclass4;

public class Outer {
    public static class Inner {
        public void show1() {
            System.out.println("非静态方法被调用了");
        }

        public static void show2() {
            System.out.println("静态方法被调用了");
        }
    }

}
