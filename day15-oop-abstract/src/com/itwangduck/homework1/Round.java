package com.itwangduck.homework1;

public class Round extends Shape {
    private double radius;
    private static final double PI = 3.1415;

    public Round(double radius) {
        this.radius = radius;
    }

    public Round() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("周长是" + PI * radius * 2);
    }

    @Override
    public void getPreimeter() {
        System.out.println("面积是" + PI * radius * radius);
    }
}
