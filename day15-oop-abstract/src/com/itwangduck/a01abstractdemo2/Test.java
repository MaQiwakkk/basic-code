package com.itwangduck.a01abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("Green", 1);
        System.out.println(f.getName() + f.getAge());
        f.drink();
        f.eat();
    }
}
