package com.itwdk.a02myhashmap;

import java.util.HashMap;

public class A01_HashMapDemo1Draft {
    public static void main(String[] args) {
        /*
        需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生

        核心点：
            HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
       */

        HashMap<Student, String> hm = new HashMap<>();
        Student student1 = new Student("Mike", 20);
        Student student2 = new Student("Bin", 23);
        Student student3 = new Student("Viper", 22);

        hm.put(student1, "America");
        hm.put(student2, "China");
        hm.put(student3, "South Korea");

        //Student student4 = new Student("Viper", 22);
        //hm.put(student4, "North Korea");

        hm.forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
