package com.itzzq.a01datedemo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //定义字符串表示三个时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:1:0";

        //解析得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //得到毫秒值
        long starttime = startDate.getTime();
        long endtime = endDate.getTime();
        long ordertime = orderDate.getTime();

        //判断
        if (starttime <= ordertime && ordertime <= endtime) {
            System.out.println("参加秒杀活动成功");
        }
    }
}
