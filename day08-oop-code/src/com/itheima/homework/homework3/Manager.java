package com.itheima.homework.homework3;

public class Manager {
    private String name;
    private String id;
    private int salary;
    private int bonus;

    public Manager(String name, String id, int salary, int bonus) {
        this.bonus = bonus;
        this.salary = salary;
        this.id = id;
        this.name = name;
    }


    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //methods;
    public void work() {
        System.out.println("工号为" + getId() + "基本工资为" + getSalary() + "奖金为" + getBonus() + "的项目经理" + getName() + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

}
