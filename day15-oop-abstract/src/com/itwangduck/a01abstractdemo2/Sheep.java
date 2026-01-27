package com.itwangduck.a01abstractdemo2;

public class Sheep extends Animal{
    @Override
    public void eat() {
        System.out.println("山羊吃草");
    }

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }
}
