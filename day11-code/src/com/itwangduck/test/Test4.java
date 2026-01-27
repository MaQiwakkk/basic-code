package com.itwangduck.test;

import java.util.ArrayList;

    //需求:定义一个集合，添加一些学生对象，
    // 并进行遍历学生类的属性为:姓名，年龄。

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 18);
        Student s3 = new Student("wangwu", 18);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+" "+stu.getAge());
        }
    }
}
