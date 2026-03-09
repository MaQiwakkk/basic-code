package com.itwdk.searchcode;

public class A02_InterpolationSearchDemo {
    public static void main(String[] args) {
        //Gemini大哥的代码
        //插值查找,数据必须有序
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("元素" + arr[i] + "的位置是第" + method1(arr, arr[i]) + "个");
        }
        System.out.println(method1(arr, 0));
        System.out.println(method1(arr, 11));

    }

    public static int method1(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;

        // 必须保证 key 在范围内，否则 mid 计算会越界
        // 同时也处理了 arr[min] == arr[max] 的情况
        while (min <= max && key >= arr[min] && key <= arr[max]) {
            if (arr[min] == arr[max]) { // 避免分母为0
                return arr[min] == key ? min : -1; // 都arr[min] == arr[max]了，还没找到的话返回-1
            }

            // 核心修正：先乘后除，避免因为整数除法过早丢失精度
            int mid = min + (key - arr[min]) * (max - min) / (arr[max] - arr[min]);

            //System.out.println("mid=" + mid); // 建议打印一下看看预测过程

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
