package com.itwdk.sortcode;

public class A02_SelectionDemoDraft {
    public static void main(String[] args) {
        // 选择排序 = 先不断更新最小值索引 → 最后只交换 1 次
        // 不可以边比较，边交换
        int[] arr = {5, 4, 2, 3, 6, 1};
        mySelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void mySelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;


            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();


        }
    }
}