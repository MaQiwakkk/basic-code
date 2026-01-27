package com.itwangduck.a06interfacedemo6;

public class Test {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();//调用接口的抽象方法
        ii.method(); //调用接口的默认方法

    }
}
