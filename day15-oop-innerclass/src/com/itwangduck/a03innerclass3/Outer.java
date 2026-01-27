package com.itwangduck.a03innerclass3;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println(Outer.this.a);//理解为（Outer.this）.a  这个this是Outer的this  直接获取外部类的成员变量
            System.out.println(this.a);
            System.out.println(a);
        }
    }
}
