package com.itwangduck.a01abstractdemo1;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
