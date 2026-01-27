package com.itwangduck.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工只类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String str =ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5, 2.6, 3.9, 4.6, 5.7};
        double avg =  ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
