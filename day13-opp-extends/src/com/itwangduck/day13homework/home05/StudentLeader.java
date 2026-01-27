package com.itwangduck.day13homework.home05;

public class StudentLeader extends Person {
    private String job;

    public StudentLeader() {

    }

    public StudentLeader(int age, String name, String gender, String nationality, String job) {
        super(age, name, gender, nationality);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void work() {
        System.out.println("学生干部喜欢开会!");
    }
}
