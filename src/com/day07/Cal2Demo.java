package com.day07;

import java.util.Calendar;
import java.util.Date;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-29 10:39
 **/
public class Cal2Demo {
    public static void main(String[] args) {
        //2种日期相互转换
        //Calendar 转换成Date
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d.getYear()+1900);
        System.out.println("-------");
        //Date转换成Calendar
        Date d2 = new Date();//当前系统时间
        d2.setDate(d2.getDate()+5);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);
        System.out.println(c2.get(Calendar.YEAR));
        System.out.println(c2.get(Calendar.DATE));

    }
}
