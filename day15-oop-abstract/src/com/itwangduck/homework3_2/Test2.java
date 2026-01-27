package com.itwangduck.homework3_2;

public class Test2 {
    public static void main(String[] args) {
        Fun anonymousF = new Fun() {
            @Override
            public void fun() {
                System.out.println("匿名内部类：重写fun()方法");
            }
        };
        //anonymousFun看作是继承了父类Fun的一个匿名子类的对象
        anonymousF.fun();
    }
}
