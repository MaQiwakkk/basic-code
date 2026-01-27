package com.itwangduck.day13homework.home06;

public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println("在吃" + something);
    }

    public void lookHome() {
        System.out.println("看家中");
    }


}
