package com.itzzq.a05testdraft;

public class Test2Draft {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符，最少一位，最多10位，0不能开头
        */
        String str = "123";
        if (!str.matches("[1-9]\\d{0,9}")) {
            //错误的数据
            System.out.println("数据格式有误");
        } else {
            //正确的数据
            int result = myParseInt(str);
            System.out.println(result);
        }
    }

    private static int myParseInt(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - '0';
            sum = sum * 10 + temp;
        }
        return sum;
    }
}
