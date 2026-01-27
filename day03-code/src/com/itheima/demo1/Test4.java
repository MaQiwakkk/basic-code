package com.itheima.demo1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("输入第二只老虎的体重");
        int weight2 = sc.nextInt();

        String result =weight1==weight2? "相同":"不同";
        System.out.println(result);
    }
}
