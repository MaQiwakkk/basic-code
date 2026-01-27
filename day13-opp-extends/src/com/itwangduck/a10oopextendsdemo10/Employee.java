package com.itwangduck.a10oopextendsdemo10;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void work() {
        System.out.println("正在工作");
    }

    public void eat(){
        System.out.println("在吃米饭");
    }
}
