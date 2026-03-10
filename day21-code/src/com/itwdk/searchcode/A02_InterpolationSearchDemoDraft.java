package com.itwdk.searchcode;

public class A02_InterpolationSearchDemoDraft {
    public static void main(String[] args) {
        //插值查找,数据必须有序
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("元素" + arr[i] + "的位置是第" + method(arr, arr[i]) + "个");
        }
        System.out.println(method(arr, 0));
        System.out.println(method(arr, 11));
    }

    public static int method(int[] arr, int key) { // 插值查找method
        int min = 0;
        int max = arr.length - 1;


        while (min <= max && key >= arr[min] && key <= arr[max]) {
            //int mid = min + (key - arr[min]) / (arr[max] - arr[min]) * (max - min);
            int mid = min + (key - arr[min]) * (max - min) / (arr[max] - arr[min]);
            if (arr[mid] < key) {
                min = mid + 1;
            } else if (arr[mid] > key) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
