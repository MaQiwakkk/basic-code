package com.itwangduck.a01oopextendsdemo1;

public class Animal {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }

    //注意事项:
    //子类只能访问父类中非私有的成员
    private void ownMethod() {
        System.out.println("父类私有方法，子类无法访问");
    }
}
