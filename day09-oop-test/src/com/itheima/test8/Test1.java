package com.itheima.test8;

public class Test1 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        //Student stu3 = new Student(3, "wangwu", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        //arr[2] = stu3;

        //题目要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //题目要求2:添加完毕之后，遍历所有学生信息。
        Student stu4 = new Student(4, "zhaoliu", 26);

        boolean flag = contains(arr, stu4.getId()); //flag=true表示id重复
        if (flag) {//id重复
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {//id不重复
            int count = getCount(arr);
            if (count == arr.length) {//arr已经满了
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {//arr还没满
                arr[count] = stu4;
                printArr(arr);
            }
        }

    }

    //getCount方法得到数组有几个元素已经存了学生信息
    public static int getCount(Student[] arr) {
        int count = 0;//定义一个计数器统计非空个数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //contains方法判断id是否重复
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //creatNewArr方法用于生成一个长度+1的新数组
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
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
