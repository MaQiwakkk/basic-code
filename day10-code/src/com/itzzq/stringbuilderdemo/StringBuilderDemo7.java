package com.itzzq.stringbuilderdemo;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String arr1 = arrToString(arr);
        System.out.println(arr1);

    }

    public static String arrToString(int[] arr) {
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

