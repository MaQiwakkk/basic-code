package com.itheima.homework.homework2;

public class GirlFriend {
    private String name;
    private int height;
    private int weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.print("我女朋友叫");
        System.out.print(getName() + ",");
        System.out.print("她身高");
        System.out.print(getHeight() + "厘米,");
        System.out.print("体重");
        System.out.println(getWeight() + "斤。");

    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }
}
