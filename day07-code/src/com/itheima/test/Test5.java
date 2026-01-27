package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] score = {98, 85, 90, 95, 82};
        for (int i = 0; i < score.length; i++) {
            for (int j = i + 1; j < score.length; j++) {
                if (score[i] > score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(score));
        double sum = 0;
        for (int i = 1; i < score.length-1; i++) {
            sum = sum+score[i];
        }
        sum = sum/(score.length-2);
        System.out.println(sum);
    }

}
