package com.itheima.homework.homework4;

public class Cat1 {
    private String color;
    private String breed;

    public Cat1() {
    }

    public Cat1(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(getColor()+"的"+getBreed()+"正在正在吃鱼.....");
    }

    public void catchMouse(){
        System.out.println(getColor()+"的"+getBreed()+"正在逮老鼠....");
    }

}


