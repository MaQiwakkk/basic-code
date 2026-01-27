package com.itwangduck.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        //不过这里并没有用多态方式创立对象
        Student s = new Student();
        s.setNeme("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setNeme("王建国");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setNeme("管理员");
        admin.setAge(35);

        //用多态方式调用方法
        register(s);
        register(t);
        register(admin);
    }


    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
