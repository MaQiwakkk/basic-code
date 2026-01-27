package com.itheima.test5;

public class StudentTest {
    public static void main(String[] args) {
        //空参构造的初始化
        Student s1 = new Student();

        //带参构造的初始化
        Student s = new Student("zhangsan", 23);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
