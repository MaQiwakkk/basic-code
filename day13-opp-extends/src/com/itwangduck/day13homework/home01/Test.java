package com.itwangduck.day13homework.home01;

public class Test {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.setId("0001");
        b.setName("zzq");
        b.work();
        System.out.println(b.getId() + ", " + b.getName());
    }
}
