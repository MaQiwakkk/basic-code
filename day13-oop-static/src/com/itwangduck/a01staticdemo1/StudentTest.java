package com.itwangduck.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "hou_shi_xi";
        //    static静态变量调用方式:
        //    类名调用(推荐)
        //    对象名调用(不推荐)

        Student s1 = new Student();
        s1.setName("zzq");
        s1.setAge(23);
        s1.show();


        Student s2 = new Student();
        s2.setName("zzl");
        s2.setAge(22);
        s2.show();
    }
}
