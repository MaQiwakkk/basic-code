package com.itzzq.a05testdraft;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1Draft {
    public static void main(String[] args) {
        /*
            键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("请输入一个整数");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if (num >= 1 && num <= 100) {
                list.add(num);
            } else {
                System.out.println("your input is inappropriate，please try again");
            }

            sum = getSumDraft(list);
            if (sum > 200) {
                break;
            }
        }
    }

    private static int getSumDraft(ArrayList<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }
        return result;
    }
}
