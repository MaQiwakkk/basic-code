package com.itwangduck.a07oopextendsdemo7;

public class SharPei extends Dog {
    //因为沙皮狗吃的狗粮和骨头
    //父类中的方法不能满足我们的需求了，所以需要进行重写


    @Override
    public void eat() {
        super.eat();//沙皮狗吃狗粮,用super调用父类存在的内容
        System.out.println("沙皮狗吃骨头");
    }
}
