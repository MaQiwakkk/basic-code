package com.itwangduck.a07interfacedemo7;

public interface Inter {

    public abstract void method();

    public static void show() {
        System.out.println("接口的静态方法-----show");//接口的静态方法是不能被重写的
    }
}
