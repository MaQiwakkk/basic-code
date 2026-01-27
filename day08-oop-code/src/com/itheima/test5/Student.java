package com.itheima.test5;

public class Student {
    private String name;
    private int age;



    //空参构造
    public Student() {
        System.out.println("看看我执行了吗？");
    }

    //带参构造，一旦自己定义了带参构造，
    //那么系统将给出默认的无参数构造方法就没了，要自己写。
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}