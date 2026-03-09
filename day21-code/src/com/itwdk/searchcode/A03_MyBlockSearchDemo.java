package com.itwdk.searchcode;

public class A03_MyBlockSearchDemo {
    public static void main(String[] args) {

        //拓展的分块查找，范围无交集 Draft
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};


        //创建4个块的对象
        MyBlock b1 = new MyBlock(22, 40, 0, 4);
        MyBlock b2 = new MyBlock(13, 20, 5, 8);
        MyBlock b3 = new MyBlock(7, 10, 9, 10);
        MyBlock b4 = new MyBlock(43, 50, 11, 13);

        //定义数组用来管理三个块的对象（索引表）
        MyBlock[] myBlockArr = {b1, b2, b3, b4};

        //定义一个变量用来记录要查找的元素
        int key = 48;

        //调用方法，传递索引表，数组，要查找的元素
        int index = MyGetIndex(myBlockArr, arr, key);


        //打印一下
        System.out.println(index);
    }

    private static int MyGetIndex(MyBlock[] myBlockArr, int[] arr, int key) {
        //1.确定key是在那一块当中
        int myIndex = myFindIndexBlock(myBlockArr, key);
        if(myIndex == -1){
            return -1;
        }

        //2.获取这一块的起始索引和结束索引
        int startIndex = myBlockArr[myIndex].getStartIndex();
        int endIndex = myBlockArr[myIndex].getEndIndex();

        //3.遍历

        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }

    private static int myFindIndexBlock(MyBlock[] myBlockArr, int key) {
        for (int i = 0; i < myBlockArr.length; i++) {
            if (key >= myBlockArr[i].getMin() && key <= myBlockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class MyBlock {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public MyBlock() {
    }

    public MyBlock(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}


