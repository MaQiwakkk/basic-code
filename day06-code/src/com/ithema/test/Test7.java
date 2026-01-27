package com.ithema.test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int number = 10;
        System.out.println(ifExist(number,arr));
    }

    public static boolean ifExist(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
