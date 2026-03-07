package com.itzzq.a05testdraft;

public class Test3Draft {
    public static void main(String[] args) {
        /*
            自己定义一个方法，实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        */
        System.out.println(mytobinarystring(15));

    }

    public static String mytobinarystring(int number) {
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            int temp = number % 2;
            sb = sb.insert(0, temp);
            number = number / 2;
            if (number == 0) {
                break;
            }
        }
        String result = sb.toString();
        return result;
    }
}
