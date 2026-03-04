package com.itzzq.a01datedemo01;

import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    static void main(String[] args) {
/*
        public final Date getTime()         获取日期对象
        public final setTime(Date date)     给日历设置日期对象

        public long getTimeInMillis()               拿到时间毫秒值
        public void settimeInMillis(long millis)    给日历设置时间毫秒值

        public int get(int field)               取日期中的某个字段信息
        public void set(int field,int value)    修改日历的某个字段信息
        public void add(int field,int amount)   为某个字段增加/减少指定的值
*/



        //1.获取日历对象
        //细节:ca1endar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象//底层原理:
        //会根据系统的不同时区来获取不同的日历对象。//把会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中


        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);//设置为时间原点

        //get方法
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月份加1
        int date = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "," + month + "," + date);//打印时间原点

        //set方法
        c.set(Calendar.YEAR, 2026);
        c.set(Calendar.MONTH, 3);
        c.set(Calendar.DAY_OF_MONTH, 4);

        year = c.get(Calendar.YEAR);//更新年月日数据
        month = c.get(Calendar.MONTH) + 1;
        date = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "," + month + "," + date);//打印

        //add方法
        c.add(Calendar.DAY_OF_MONTH, 1);
        month = c.get(Calendar.DAY_OF_MONTH);//更新数据
        System.out.println(year + "," + month + "," + date);//打印

    }
}
