package com.itheima.homework;

public class Homework5 {
    public static void main(String[] args) {
        int[] scores = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double sum = 0;
        double average = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        average = sum / scores.length;
        System.out.println("average is " + average);
    }
}
