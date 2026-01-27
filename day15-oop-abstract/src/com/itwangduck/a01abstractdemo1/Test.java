package com.itwangduck.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //Person person = new Person();报错 抽象类不能创建实例

        Student student = new Student("zhangsan", 23);
        System.out.println(student.getName() + ", " + student.getAge());
    }
}
