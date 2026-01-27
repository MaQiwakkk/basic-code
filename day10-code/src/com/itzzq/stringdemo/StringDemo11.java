package com.itzzq.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        String id = "330483200210160033";

        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        char genderInfo = id.charAt(16);
        System.out.println("人物信息为:");
        if ((genderInfo) / 2 == 0) {//char 类型与整数进行运算时，会自动提升为int 类型
            System.out.println("女性");
        } else {
            System.out.println("男性");
        }
        System.out.printf("出生年月日为:%s年%s月%s日", year, month, day);
    }
}
