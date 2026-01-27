package com.ithema.homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int n2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int n3 = sc.nextInt();
        printInOrder(n1, n2, n3);

    }

    public static void printInOrder(int n1, int n2, int n3) {
        int max = n1 > n2 ? n1 : n2;
        max = max > n3 ? max : n3;

        int min = n1 < n2 ? n1 : n2;
        min = min < n3 ? min : n3;

        int mid = n1 + n2 + n3 - max - min;

        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);


    }
}
