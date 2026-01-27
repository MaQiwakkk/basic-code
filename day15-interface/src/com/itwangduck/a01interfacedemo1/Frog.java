package com.itwangduck.a01interfacedemo1;

public class Frog extends Animal  implements Swim {
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃蚊子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }
}
