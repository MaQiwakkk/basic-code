package com.itzzq.test;

public class Test2Case2 {
    public static void main(String[] args) {
        /*给定两个字符串，A和B。
        A的旋转操作就是将A 最左边的字符移动到最右边。
        例如，若A='abcde'，在移动一次之后结果就是'bcdea
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false

        这里用String类型的toCharArray方法
        */

        String initialStr1 = "abcde";
        String str1 = "abcde";
        String str2 = "cdeab";

        char[] arr = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            String tempStr = rotate(arr);
            if (tempStr.equals(str2)) {
                System.out.printf("旋转成功，从%s旋转到%s，旋转了%d次", initialStr1, str2, (i + 1));
                break;
            } else if (i == str1.length() - 1 && !tempStr.equals(str1)) {
                System.out.printf("旋转失败");
            }
        }
    }

    private static String rotate(char[] arr) {
        char temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        String result = new String(arr);
        return result;
    }
}