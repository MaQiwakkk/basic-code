package com.itzzq.homework;

import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        //验证码生成 Fisher-Yates 洗牌算法
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        //添加1位数字
        sb.append(r.nextInt(10));

        //添加4位大小写随机字母
        for (int i = 0; i < 4; i++) {
            int x = r.nextInt(2);
            if (x == 0) {
                int index = r.nextInt(26);
                char c = (char) (index + 65);
                sb.append(c);
            } else {
                int index = r.nextInt(26);
                char c = (char) (index + 97);
                sb.append(c);
            }
        }
        String result = Shuffler(sb.toString());
        System.out.println(result);
    }

    // Fisher-Yates 洗牌算法
    public static String Shuffler(String str) {
        char[] arr = str.toCharArray();

        Random r = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String strNew = new String(arr);
        return strNew;
    }
}
