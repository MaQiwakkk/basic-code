package com.itmq.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs绝对值，absExact带有检验的绝对值
        System.out.println("abs==================");
        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-2147483648));//会出bug 以int类型为例，取值范围: -2147483648~2147483647
        //System.out.println(Math.absExact(-2147483648));

        //ceil向上取整 floor向下取整
        System.out.println("ceil==================");
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.ceil(-9.9));
        System.out.println("floor==================");
        System.out.println(Math.floor(12.3));
        System.out.println(Math.floor(-9.9));

        //round四舍五入
        System.out.println("round==================");
        System.out.println(Math.round(12.3));
        System.out.println(Math.round(-9.9));

        //max min 获取两个数的较大，小值
        System.out.println("max==================");
        System.out.println(Math.max(20, 12.3));
        System.out.println("min==================");
        System.out.println(Math.min(1.0, 40));

        //pow(a, b)获取a的b次幂 b是小数就是开根号 b也可以是负数
        System.out.println("pow(a, b)==================");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.pow(8,1/3));//整数除法陷阱，1/3 = 0，结果是1.0
        System.out.println(Math.pow(8,1.0/3.0));
        System.out.println(Math.pow(2,-2));
        System.out.println(Math.pow(0,0));

        //sqrt cbrt返回平方根和立方根
        System.out.println("sqrt cbrt==================");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(27));

        //Math.random() 返回一个随机数[0.0 1.0),前端写法
        System.out.println("Math.random()==================");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
    }
}
