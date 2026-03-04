package com.itzzq.a01datedemo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04_SimpleDateFormat2 {
    public static void main(String[] args) throws ParseException {
        //原格式
        String str ="2000-11-11";

        //解析 SimpleDateFormat的parse方法将会识别传入的字符串得到一个Date类型对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);

        //格式化 SimpleDateFormat的format方法将date对象变为一个（之前指定过格式的）字符串对象，方便查看
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);
    }
}
