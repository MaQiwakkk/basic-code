package com.itwangduck.day13homework.home06;

public class Animal {
    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String something){

    }
}
