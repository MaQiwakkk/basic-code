package com.itwdk.test.test3;

public class Test3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        最后一天还没吃，发现只剩下一个桃子了
        请问，对任意总天数x天，第一天总共多少个桃子？
        */

        // 递归解决 Day(n-1) = 2(Day(n) + 1)
        //         Day(n) = Day(n-1)/2 -1

        System.out.println(getInitial(10));

    }

    public static int getInitial(int totalDay) {
        if (totalDay == 1) { // 最后一天
            return 1;
        }
        // 前一天 = 2 × (后一天 + 1)
        return 2 * (getInitial(totalDay - 1) + 1);
    }
}
