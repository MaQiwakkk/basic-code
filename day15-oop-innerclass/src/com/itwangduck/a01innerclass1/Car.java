package com.itwangduck.a01innerclass1;

public class Car {//外部类
    String carName;
    int carAge;
    String carColor;
    public void show(){
        //System.out.println(engineName); 报错 外部类不能直接访问内部类的成员变量
        System.out.println(carName);
    }

    class Engine{//内部类
        String engineName;
        String engineColor;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }

    }
}
