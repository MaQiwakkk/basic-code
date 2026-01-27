package com.itwangduck.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.printf("please enter the name of  student%d you want to add: ", (i + 1));
            String name = sc.next();
            System.out.printf("please enter the age of  student%d you want to add: ", (i + 1));
            int age = sc.nextInt();

            Student stu = new Student(name, age);
            list.add(stu);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Student%d's name is %s, and his/her age is %d\n", (i + 1), list.get(i).getName(), list.get(i).getAge());
        }
    }
}
