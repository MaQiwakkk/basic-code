package com.itwangduck.a10oopextendsdemo10;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double salary, String id, double bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }


}
