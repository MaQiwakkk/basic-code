package com.itwangduck.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //多态方式创建对象
        Animal a = new Dog();
        //编译看左边，运行看右边
        a.eat();

        //多态的弊端
        //不能调用子类特有的功能
        //a.lookHome(); 报错

        //解决方案：
        //变回子类型，用关键字instanceof
        //不能乱转 比如不能把上面的a强转为Cat

//        if (a instanceof Dog) {
//            Dog d = (Dog) a;
//            d.lookHome();
//        } else if (a instanceof Cat) {
//            Cat c = (Cat) a;
//            c.catchMouse();
//        } else {
//            System.out.println("没有这个类型，无法转换");
//        }

        //JDk14新特性
        if (a instanceof Dog d) { //a是否为Dog类型？如果是直接强转为d；如果不是，返回false。
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("没有这个类型，无法转换");
        }




    }
}

class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }

}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
