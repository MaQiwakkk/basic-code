package com.itwangduck.a08interfacedemo8;

public interface InterB {
    public static void show4() {
        System.out.println("show4方法开始执行了");
    }

    public static void show5() {
        System.out.println("show5方法开始执行了");
    }

    //静态的私有方法，给上面的静态方法服务的
    private static void show6() {
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }

}
