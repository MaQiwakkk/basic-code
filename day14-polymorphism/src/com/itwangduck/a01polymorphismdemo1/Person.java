package com.itwangduck.a01polymorphismdemo1;

public class Person {
    private String name;
    private int age;

    public Person(String neme, int age) {
        this.name = neme;
        this.age = age;
    }

    public Person() {
    }

    public String getNeme() {
        return name;
    }

    public void setNeme(String neme) {
        this.name = neme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + ", " + age);

    }
}
