package com.itwdk.lambdacode;

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*
            Lambda表达式的注意点：
                1. Lambda表达式可以用来简化匿名内部类的书写
                2. Lambda表达式只能简化函数式接口的匿名内部类的写法
                3. 函数式接口：
                    有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
         */

        // 1. 利用匿名内部类的形式去调用下面的方法
        // 调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
        // 如果实现类对象只要用到一次，就可以用匿名内部类的形式进行书写

        // 这是之前熟悉的匿名内部类写法：
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳~~~");
            }
        });

        // 2. 利用Lambda表达式进行简化
        // 因为 method 方法的目标类型是 Swim 接口，且它是函数式接口
        // 所以我们可以直接把“动作”传进去
        method(
                () -> {
                    System.out.println("Lambda 简化的游泳~~~");
                }
        );
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

// 定义一个游泳接口
@FunctionalInterface // 这是一个函数式接口，可以用 Lambda 简化
interface Swim {
    public abstract void swimming();
}