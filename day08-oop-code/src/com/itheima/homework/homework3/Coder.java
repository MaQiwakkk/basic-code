package com.itheima.homework.homework3;

public class Coder {
    private String name;
    private String id;
    private int salary;

    public Coder() {
    }

    public Coder(String name, String id, int salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void work() {
        System.out.println("工号为" + getId() + "基本工资为" + getSalary() + "的程序员" + getName() + "正在努力的写着代码....");
    }
}
