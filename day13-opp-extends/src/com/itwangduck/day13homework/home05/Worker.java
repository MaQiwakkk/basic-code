package com.itwangduck.day13homework.home05;

public class Worker extends Person {
    private String unit;
    private int workAge;

    public Worker(int age, String name, String gender, String nationality, String unit) {
        super(age, name, gender, nationality);
        this.unit = unit;
    }

    public Worker() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子!");
    }
}
