package com.itwangduck.a06interfacedemo6;

public class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("实现类重写的抽象的method方法");
    }

    @Override
    public void show() {
        System.out.println("实现类重写的default的show方法");
    }
}
