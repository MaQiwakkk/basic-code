package com.itwangduck.homework1;

public class Retangle extends Shape {
    private double length;
    private double width;

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Retangle() {
    }

    @Override
    public void getArea() {
        System.out.println("面积是" + length * width);
    }

    @Override
    public void getPreimeter() {
        System.out.println("周长是" + 2 * (length + width));
    }
}
