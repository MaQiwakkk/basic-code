package com.itheima.test2;

public class GirlFriend {
    //属性
    private String name;//定义在类里面，成员变量
    private int age;//成员变量
    private String gender;//成员变量

    //针对于每一个私有化的成员变量，都要提供get和set方法
    // set方法:给成员变量赋值
    // get方法:对外提供成员变量的值

    //this关键字 就近原则，解决 “成员变量与局部变量重名” 的冲突
    public void setName(String name) {//同名的name 是局部变量 要用this
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数！");
        }

    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //行为
    public void sleep() {
        System.out.println("在睡觉");
    }

    public void eat() {
        System.out.println("在吃饭");
    }
}
