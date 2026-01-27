package com.itwangduck.a07interfacedemo7;

public class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("重写了抽象方法");
    }

/*
    尝试重写静态方法：报错
    @Override
    public static void show() {
        System.out.println("我要重写静态方法");
    }
*/

    //但是实现类可以有一个刚好跟接口里重名的静态方法
    public static void show() {
        System.out.println("我刚好跟接口的静态方法重名了");
    }

    //Inter.show():调用接口的show方法
    //InterImpl.show():调用InterImpl类的show方法
}
