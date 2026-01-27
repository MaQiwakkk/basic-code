package com.itwangduck.a01abstractdemo1;

public abstract class Person {
//    抽象类不能实例化
//    抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
//    可以有构造方法
//    抽象类的子类:
//       1 要么重写抽象类中的抽象方法
//       2 要么是抽象类（但还得创建不是抽象类的孙子类才能创建实例）

    //抽象类的构造方法是子类创建对象时赋值用的，自己本身用不到
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    public abstract void work();
}
