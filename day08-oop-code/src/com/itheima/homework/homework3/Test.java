package com.itheima.homework.homework3;

public class Test {
    public static void main(String[] args) {
        Manager manager1 = new Manager("张三", "123", 15000, 6000);
        Coder coder1 = new Coder("李四", "123", 10000);

        manager1.work();
        coder1.work();
    }
}
