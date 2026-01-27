package com.itwangduck.day13homework.home01;

public class Lecturer extends Teacher{
    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

    @Override
    public void work() {
        System.out.println("lecture is working...");
    }
}
