package com.itwangduck.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("经理张三", 18888.88, "m0001", 4999.99);
        m.eat();
        m.work();
        System.out.println(m.getName() + ", " + m.getId() + ", " + m.getId() + ", " + m.getBonus());

        Cook c = new Cook();
        c.setName("厨子李四");
        c.setId("c0002");
        c.setSalary(8888.88);
        c.eat();
        c.work();
        System.out.println(c.getName() + ", " + c.getId() + ", " + c.getId() );
    }
}
