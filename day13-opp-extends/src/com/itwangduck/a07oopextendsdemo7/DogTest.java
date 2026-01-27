package com.itwangduck.a07oopextendsdemo7;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();

    }
}
