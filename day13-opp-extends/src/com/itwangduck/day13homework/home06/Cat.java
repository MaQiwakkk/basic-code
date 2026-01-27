package com.itwangduck.day13homework.home06;

public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.println("在吃"+something);
    }

    public void catchMouth(){
        System.out.println("正在看家");
    }
}

