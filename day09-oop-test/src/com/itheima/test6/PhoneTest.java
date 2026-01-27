package com.itheima.test6;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("xiaomi", 1999, "black");
        Phone p2 = new Phone("huawei", 5999, "white");
        Phone p3 = new Phone("Apple", 11999, "orange");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }

        double avg = sum * 1.0 / arr.length;
        System.out.println(avg);
    }
}
