package com.itwdk.test.test5;

public class Test5Recursion {
    public static void main(String[] args) {
        System.out.println(climb(5));
    }

    // 过高阶直接栈溢出卡死，尝试109阶会报错
    public static long climb(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (n == 3) {
            return 4;
        }
        return climb(n - 1) + climb(n - 2) + climb(n - 3);
    }
}
