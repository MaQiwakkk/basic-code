package com.itwangduck.homework4;

public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

class Outer {
    // 方法返回值是Inter接口类型
    public static Inter method() {
        // 实际返回的是“实现了Inter接口的匿名内部类对象”
        return new Inter() {
            @Override
            public void show() {
                System.out.println("Hello World!");
            }
        };
    }
}