package com.itheima.homework.homework1;


public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("Xiaomi");
        p1.setColor("黑色");
        p1.setPrice(3998);
        System.out.print("正在使用价格为" + p1.getPrice() + "元的" + p1.getColor()  + p1.getBrand()+ "手机");
        p1.call();

        System.out.print("正在使用价格为" + p1.getPrice() + "元的" + p1.getColor()  + p1.getBrand()+ "手机");
        p1.sendMessage();
    }
}
