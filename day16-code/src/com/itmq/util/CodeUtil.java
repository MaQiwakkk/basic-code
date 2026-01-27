package com.itmq.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('A' + i));
            list.add((char) ('a' + i));
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            result = result + list.get(index);
        }
        result = result + r.nextInt(10);
        //把字符串变成一个字符数组
        char[] chars = result.toCharArray();

        //Fisher-Yates 洗牌算法打乱
        for (int i = chars.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }

}
