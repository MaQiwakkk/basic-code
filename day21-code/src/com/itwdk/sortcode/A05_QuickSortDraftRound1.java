package com.itwdk.sortcode;

public class A05_QuickSortDraftRound1 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        // 调用方法，执行快速排序的第一轮:
        myQuickSort(arr, 0, arr.length - 1);

        // 打印第一轮排序后的结果
        // 预期结果应该是基准数 6 左边的都比它小，右边的都比它大
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void myQuickSort(int[] arr, int i, int j) {
        // 定义两个变量记录要查找的范围
        int start = i;
        int end = j;

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
        // 基准数归位：把基准数跟start（或end）指向的位置进行交换,第一轮结束
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
    }
}
