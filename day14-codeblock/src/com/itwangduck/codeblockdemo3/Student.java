package com.itwangduck.codeblockdemo3;

public class Student {
    private String name;
    private int age;

    //执行时机:
    //随着类的加载而加载的，并且只执行一次。
    //想做一些数据初始化，最好写在静态代码块，而不是mian方法的最上面
    static{
        System.out.println("静态代码块执行了");
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
