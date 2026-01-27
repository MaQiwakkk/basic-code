package com.itwangduck.a04innerclass4;

public class Test {
//注意事项:
//1.静态内部类是成员内部类中特殊的一种
//2.静态内部类只能访问外部类中的静态变量和静态方法，
//  如果想要访问非静态的需要在内部类里先创建一个外部类的对象。

//创建静态内部类对象的格式:
//    外部类名.内部类名 对象名 = new 外部类名.内部类名();
//调用静态方法的格式:
//     外部类名.内部类名.方法名();

    //创建静态内部类的对象
//只要是静态的东西，都可以用类名点直接获取
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        //静态方法直接类名一点到底调用
        Outer.Inner.show2();
    }
}
