package com.itwdk.test.test5;

public class Test5 {
    public static void main(String[] args) {
        int n = 5; //
        System.out.println("爬" + n + "阶的总方法数：" + getClimbWays(n));
    }

    /**
     * 计算一次爬1/2/3阶的总爬法数
     * @param n 台阶总数
     * @return 总方法数
     */
    public static long getClimbWays(int n) {
        // 处理边界情况（n<1无意义，n=1/2/3直接返回出口值）
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        // 初始化：a=f(1), b=f(2), c=f(3)
        long a = 1;
        long b = 2;
        long c = 4;
        long res = 0; // 存储最终结果

        // 从4阶开始迭代，直到n阶
        for (int i = 4; i <= n; i++) {
            res = a + b + c; // f(i) = f(i-1)+f(i-2)+f(i-3)
            // 变量后移：为下一次迭代准备（a→f(i-2), b→f(i-1), c→f(i)）
            a = b;
            b = c;
            c = res;
        }
        return res;
    }
}
