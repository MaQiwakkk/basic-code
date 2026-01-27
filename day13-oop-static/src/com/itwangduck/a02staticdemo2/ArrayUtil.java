package com.itwangduck.a02staticdemo2;

public class ArrayUtil {
    //私有化构造方法
    //目的:禁止外部创建实例，保证工具类的 “静态使用” 特性。
    private ArrayUtil() {
    }

    //工具类的方法需要定义为静态
    //否则无法通过类名调用

    //提供一个工具类方法printArr，用于返回整数数组的内容
    //(只考虑int型数组，且只考虑一维数组)
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }


    //提供这样一个工具方法getAerage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return  sum / arr.length;
    }
}
