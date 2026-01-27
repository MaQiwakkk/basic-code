package com.itwangduck.a10oopextendsdemo10;

public class Cook extends Employee {
    public Cook(String name, double salary, String id) {
        super(name, salary, id);
    }

    public Cook() {
    }

    @Override
    public void work() {
        System.out.println("在炒菜");
    }
}
