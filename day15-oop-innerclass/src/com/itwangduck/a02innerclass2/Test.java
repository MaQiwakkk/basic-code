package com.itwangduck.a02innerclass2;

public class Test {
    public static void main(String[] args) {
        /*
        编写成员内部类的注意点:
        1.成员内部类可以被一些修饰符所修饰，比如: private，默认，protected，public，static等
        2.在成员内部类里面，JDK16之前不能定义静态变量，JDK 16开始才可以定义静态变量。

        获取成员内部类对象的两种方式:
            方式一:外部类编写方法， 对外提供内部类对象(private)

            方式二:直接创建
            格式:外部类名.内部类名对象名=外部类对象.内部类对象;
            范例:Outer.Inner oi =new Outer().new Inner();
        */

        //如果Inner是被private修饰的 用方法获取内部类 然后用object接收
        Outer o  = new Outer();
        Object i = o.getInstance();
    }
}
