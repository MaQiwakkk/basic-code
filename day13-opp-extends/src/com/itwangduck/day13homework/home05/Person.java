package com.itwangduck.day13homework.home05;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String nationality;

    public Person(int age, String name, String gender, String nationality) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){

    }

    public void sleep(){

    }

    public void work(){

    }
}
