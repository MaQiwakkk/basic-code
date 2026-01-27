package com.itwangduck.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //1.创建布偶猫的对象
        RogdollCat rd =  new RogdollCat();
        rd.eat();
        rd.catchMouse();

        //2.创建哈士奇的对象
        Husky h = new Husky();

        h.eat();
        h.drink();
        h.breakHome();
    }
}
