package com.itwangduck.day13homework.home01;

public class Maintainer extends AdminStaff{
    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }

    @Override
    public void work() {
        System.out.println("maintainer is working...");
    }
}
