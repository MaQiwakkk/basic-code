package com.itheima.homework.homework4;

public class Test {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("波斯猫","花色");
        Dogs dog1 = new Dogs("藏獒","黑色");
        cat1.eat();
        cat1.catchMouse();
        dog1.eat();
        dog1.lookHome();
    }
}
