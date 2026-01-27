package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setAge(18);
        gf1.setName("shishi");
        gf1.setGender("female");

        System.out.println(gf1.getAge());
        System.out.println(gf1.getName());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
