package com.itzzq.a05testdraft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4Draft {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成

        //1.JDK7
        // 先用字符串指定格式，然后解析得到一个Date对象，再得到出生日期的毫秒值，
        //然后和现在做差，再转换成天数
        String birthday = "2002年10月16日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        long todayTime = System.currentTimeMillis();
        long dayTime = todayTime - birthdayTime;
        System.out.println(dayTime / 1000 / 60 / 60 / 24);

        //2.JDK8
        //用LocalDateh和ChronoUnit.DAYS.between()方法
        LocalDate ldBirthdayTime = LocalDate.of(2002,10,16);
        LocalDate ldNowTime = LocalDate.now();

        long betweenDays = ChronoUnit.DAYS.between(ldBirthdayTime, ldNowTime);
        System.out.println(betweenDays);
    }
}
