package com.itwangduck.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("王大爷", 60);
        Dog d = new Dog("黑", 3);
        Cat c = new Cat("白", 2);

        p.keepPet(d, "肉骨头");
        p.keepPet(c, "小鱼干");
    }
}
