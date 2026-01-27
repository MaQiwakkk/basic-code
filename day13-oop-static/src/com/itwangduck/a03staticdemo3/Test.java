package com.itwangduck.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student(  "zhangsan",  23,  "男");
        Student stu2 = new Student( "lisi", 24,"女");
        Student stu3 = new Student( "wangwu",25,"男");
        //把学生对象添加到集合当中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
