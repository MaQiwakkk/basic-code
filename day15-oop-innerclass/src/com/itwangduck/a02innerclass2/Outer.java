package com.itwangduck.a02innerclass2;

public class Outer {
    String name;

    private class Inner {
        static int a = 10;//JDK25 支持定义静态变量
    }

    public Inner getInstance() {
        return new Inner();
    }
}
