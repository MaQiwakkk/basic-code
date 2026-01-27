package com.itzzq.homework;

public class Homework7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String str = getString(arr);
        System.out.println(str);
    }

    public static String getString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.append("]").toString();
    }
}
