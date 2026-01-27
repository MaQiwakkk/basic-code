package com.itwangduck.homework3_2;

public class Test1 {
    public static void main(String[] args) {
        // 创建子类对象（父类引用指向子类对象，多态）
        Fun f = new FunSon();
        f.fun();
    }
}
