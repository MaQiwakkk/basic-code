package com.itwangduck.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> newList = getPhoneInfo(list);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i).getBrand() + ", " + newList.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
