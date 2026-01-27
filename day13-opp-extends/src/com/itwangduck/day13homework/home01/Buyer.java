package com.itwangduck.day13homework.home01;


public class Buyer extends AdminStaff{
    public Buyer(String id, String name) {
        super(id, name);
    }

    public Buyer() {
    }

    @Override
    public void work() {
        System.out.println("buyer is working...");
    }
}
