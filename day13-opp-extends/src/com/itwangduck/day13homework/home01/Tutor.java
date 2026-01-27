package com.itwangduck.day13homework.home01;

public class Tutor extends Teacher{
    public Tutor(String id, String name) {
        super(id, name);
    }

    public Tutor() {
    }

    @Override
    public void work() {
        System.out.println("tutor is working...");
    }
}
