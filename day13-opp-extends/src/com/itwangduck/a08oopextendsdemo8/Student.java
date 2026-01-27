package com.itwangduck.a08oopextendsdemo8;

public class Student extends Person {
    //子类不能继承父类的构造方法，但是可以通过super
    //调用子类构造方法的第一行，有一个默认的super();写不写都有
    //默认先访问父类中无参的构造方法，再执行自己。
    //如果想要访问父类有参构造，必须手动书写，

    public Student() {
        //子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }
    //想访问父类有参构造，手动书写：
    public Student(String name, String id, int age) {
        super(name, id, age);
    }


}
