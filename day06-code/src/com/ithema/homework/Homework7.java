package com.ithema.homework;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int[] arr ={1,4,5,7,3,7,8};
        int value = 666;
        fill(arr,value);
        System.out.println(Arrays.toString(arr));
    }

    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value;
        }
    }
}

