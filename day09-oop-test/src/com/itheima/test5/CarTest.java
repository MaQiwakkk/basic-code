package com.itheima.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            //录入品牌
            System.out.println("请录入品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请录入价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请录入颜色");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + ", " + arr[i].getPrice() + ", " + arr[i].getColor());
        }

    }
}
