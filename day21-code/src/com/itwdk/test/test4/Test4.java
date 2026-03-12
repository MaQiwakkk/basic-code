package com.itwdk.test.test4;

public class Test4 {
    public static void main(String[] args) {
        /*
        爬楼梯，只能一次爬一个台阶，或一次爬两个台阶。
        如果这个楼梯有任意n个台阶，一共有多少种爬法？
        */
        System.out.println(getCount(6));


    }

    private static int getCount(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return getCount(n - 1) + getCount(n - 2);
    }
}
