package com.ithema.homework;

import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {
        int[] prizes = {2, 588, 888, 1000, 10000};
        int[] drawnMarks = {0, 0, 0, 0, 0};
        fill(prizes, drawnMarks); // 第1次抽奖
        fill(prizes, drawnMarks); // 第2次抽奖
        fill(prizes, drawnMarks); // 第3次抽奖
        fill(prizes, drawnMarks); // 第4次抽奖
        fill(prizes, drawnMarks); // 第5次抽奖



    }

    public static void fill(int[] arr, int[] brr) {
        Random r = new Random();
        while (true) {
            int index = r.nextInt(brr.length);
            if (brr[index] == 0) {
                brr[index] = 1;
                System.out.println(arr[index] + "元的奖金被抽出");
                break;
            }
        }


    }
}
