package com.itwangduck.a01oopextendsdemo1;

public class Husky extends Dogs{
    public void breakHome(){
        System.out.println("正在拆家");
    }

    //重写 @Override:
    //1.方法的名称、形参列表必须与父类中的一致。
    //2.子类重写父类方法时，访问权限子类必须大于等于父类(空着不写<protected<public)
    //3.子类重写父类方法时，返回值类型子类必须小于等于父类
    //4.建议:重写的方法尽量和父类保持一致。
    //5.只有被添加到"虚方法表"中的方法才能被重写
    @Override
    public void eat(){
        System.out.println("哈士奇的eat方法重写：哈士奇吃狗粮");
    }
    //应用场景:当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写。
    //注意:子类中重写的方法上面需要加上@override
}
