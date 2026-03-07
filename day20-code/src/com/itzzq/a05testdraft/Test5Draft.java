package com.itzzq.a05testdraft;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5Draft {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年，要求用JDK7和JDK8两种方式判断:
            二月有29天是闰年
            可以把时间置于3月1日，然后往前减一天，看看是28还是29号
        */

        //1.jdk7，用Calendar
        //把时间设置为2012年3月1日，闰年
        Calendar c1 = Calendar.getInstance();
        c1.set(2012, Calendar.MARCH, 1);
        c1.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        //把时间设置为2013年3月1日，平年
        Calendar c2 = Calendar.getInstance();
        c2.set(2013, Calendar.MARCH, 1);
        c2.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(c2.get(Calendar.DAY_OF_MONTH));

        //2.jdk8，用LocalDate
        //把时间设置为2012年3月1日，闰年
        LocalDate ld1 = LocalDate.of(2012,3,1).minusDays(1);
        int dayOfMonth1 = ld1.getDayOfMonth();
        System.out.println(dayOfMonth1);
        //把时间设置为2013年3月1日，平年
        LocalDate ld2 = LocalDate.of(2013,3,1).minusDays(1);
        int dayOfMonth2 = ld2.getDayOfMonth();
        System.out.println(dayOfMonth2);
    }
}
