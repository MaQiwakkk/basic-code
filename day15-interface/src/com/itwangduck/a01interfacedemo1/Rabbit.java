package com.itwangduck.a01interfacedemo1;

public class Rabbit extends Animal  {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
