package com.itwdk.sortcode;

public class A05_QuickSortDraft {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        // 调用快速排序方法
        myQuickSort(arr, 0, arr.length - 1);

        // 打印结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void myQuickSort(int[] arr, int i, int j) {
        // 定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        // 递归出口
        if (i >= j) {
            return;
        }


        // 记录基准数（默认把范围内的第一个数作为基准数）
        // 最左边为基准数，必须end先走
        int baseNumber = arr[i];

        // 利用循环找到要交换的数字
        while (start != end) {
            // end从后往前开始找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break; // 找到了比基准数小的，或者两个指针相遇了，停下来
                }
                end--;
            }

            // start从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break; // 找到了比基准数大的，或者两个指针相遇了，停下来
                }
                start++;
            }

            // 把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        // 当start和end指向了同一个元素的时候，那么上面的循环就会结束
        // 表示已经找到了基准数在数组中应存入的位置
        // 基准数归位：把基准数跟start（或end）指向的位置进行交换,本轮结束
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        // 递归，分别对左右两边的数QuickSort
        myQuickSort(arr, i, start - 1);
        myQuickSort(arr, start + 1, j);
    }
}