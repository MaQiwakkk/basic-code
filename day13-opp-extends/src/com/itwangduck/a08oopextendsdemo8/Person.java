package com.itwangduck.a08oopextendsdemo8;

public class Person {
    String name;
    String id;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, String id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
