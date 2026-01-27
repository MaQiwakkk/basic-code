package com.itwangduck.a03polymorphismdemo3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something) {
        //instanceof 看的是「对象真身」，不是「变量的表面类型」——
        //只要左边对象的实际类型是右边类型（或其子类），就返回 true。
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的狗");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的猫");
            c.eat(something);
        } else {
            System.out.println("你丫的养的啥?");
        }
    }
}
