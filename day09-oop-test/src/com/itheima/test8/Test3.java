package com.itheima.test8;

public class Test3 {
    public static void main(String[] args) {
        //题目要求3:通过id删除学生信息。如果存在，则删除，如果不存在，则提示删除失败。打出来啦
        //题目要求4:删除完毕之后，遍历所有学生信息。
        //题目要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr, 2);

        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        } else {
            System.out.println("当前id不存在，删除失败！！");
        }

    }

    //返回id值为id的学生在数组里的索引，没有的话返回-1
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    //printArr方法用于打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "，" + stu.getName() + "，" + stu.getAge());
            }
        }
    }
}
