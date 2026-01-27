package com.itwangduck.a05innerclass5;

public class Outer {
    int b = 20;

    public void show() {
        int a = 10;

        class Inner {//局部内部类
            String name;

            public void method1() {
                System.out.println(b);//直接访问外部类的成员
                System.out.println(a);//也可以访问方法内的局部变量

                System.out.println(name);
            }

            public static void method2() {
                System.out.println("name");
            }
        }
        Inner i = new Inner();
        System.out.println(i. name);
        i.method1();
        Inner.method2();
    }
}
