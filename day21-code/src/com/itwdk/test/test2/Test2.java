package com.itwdk.test.test2;

public class Test2 {
    public static void main(String[] args) {
        // 不死神兔 斐波那契数列问题 1 1 2 3 5 8 13……
        // 用递归

        int sum = rabbit(7);
        System.out.println(sum);
    }

    public static int rabbit(int month) {
        if (month == 2 || month == 1) {
            return 1;
        }

        return rabbit(month - 1) + rabbit(month - 2);
    }
}