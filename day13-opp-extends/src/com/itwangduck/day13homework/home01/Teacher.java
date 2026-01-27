package com.itwangduck.day13homework.home01;

public class Teacher extends Employee{
    public Teacher(String id, String name) {
        super(id, name);
    }

    public Teacher() {
    }

    @Override
    public void work() {
        System.out.println("teacher is working...");
    }
}
