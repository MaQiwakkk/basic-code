package com.itwangduck.day13homework.home05;

public class Student extends Person{
    private String school;
    private String stuNumber;

    public Student(int age, String name, String gender, String nationality, String school) {
        super(age, name, gender, nationality);
        this.school = school;
    }

    public Student() {

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生需要学习!");
    }
}
