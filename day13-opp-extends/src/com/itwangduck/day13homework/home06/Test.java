package com.itwangduck.day13homework.home06;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Cat cat = new Cat(2,"白色");
        Dog dog = new Dog(2,"黑色");

        person.keepPet(cat,"小鱼干");
        person.keepPet(dog,"骨头");

    }
}
