package com.itwangduck.day13homework.home01;

public class AdminStaff extends Employee {
    public AdminStaff(String id, String name) {
        super(id, name);
    }

    public AdminStaff() {
    }

    @Override
    public void work() {
        System.out.println("adminstaff is working...");
    }
}