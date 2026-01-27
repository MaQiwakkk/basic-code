package com.itheima.homework.homework4;

public class Dogs {
    private String color;
    private String breed;

    public Dogs() {
    }

    public Dogs(String breed, String color) {
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

    public void eat(){
        System.out.println(getColor()+"的"+getBreed()+"正在啃骨头.....");
    }

    public void lookHome(){
        System.out.println(getColor()+"的"+getBreed()+"正在看家....");
    }
}
