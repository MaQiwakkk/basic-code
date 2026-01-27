package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length / 2; i++) {
            chs[i] = (char) (i + 97);
        }

        for (int i = chs.length / 2; i < chs.length; i++) {
            chs[i] = (char) (i + 65 - 26);
        }

        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result += chs[randomIndex];
        }

        int number = r.nextInt(10);
        result += number;
        System.out.println(result);
    }


}
