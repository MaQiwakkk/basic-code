package com.itwangduck.a01staticdemo1;

public class Student {
    private String name;
    private int age;

//    被static修饰的成员变量，叫做静态变量
//    特点:
//    被该类所有对象共享
//    不属于对象，属于类。
//    随着类的加载而加载，优先于对象存在
//    调用方式:
//    类名调用(推荐)
//    对象名调用
    public static String teacherName;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + teacherName);
    }
}
