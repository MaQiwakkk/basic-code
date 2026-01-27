package com.itheima.test6;

public class User {
    //标准javabean
    //1类名需要见名知意
    //2成员变量使用private修饰
    //3提供至少两个构造方法：
    //无参构造方法，带全部参数的构造方法
    //4成员方法：
    //提供每一个成员变量对应的setXxx()/getXxx()如果还有其他行为，也需要写上
    //写一个标准javabean的模板
    //属性
    private String username;
    private String psssword;
    private String email;
    private String gender;
    private int age;

    //快捷键:
    // alt + insert
    // alt + Fn + insert

    //空参构造方法
    public User() {
    }

    //带全部参数的构造方法
    public User(String username, String psssword, String email, String gender, int age) {
        this.username = username;
        this.psssword = psssword;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get和set方法 2*5=10个

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsssword() {
        return psssword;
    }

    public void setPsssword(String psssword) {
        this.psssword = psssword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {return gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
