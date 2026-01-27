package com.itheima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //1.定义变量记录我心里想吃的面
        String noodles = "山西油泼面";
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "山西油泼面":
                System.out.println("吃山西油泼面");
                break;
            default:
                System.out.println("吃方便面");


        }

    }
}
