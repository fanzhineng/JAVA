package com.fzn2020.day07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-29 10:00
 **/
public class CalDemo {
    public static void main(String[] args) {
        //Calendar 是一个抽象类 不能自己直接new实例化
        //实例化的方法
        //第一种
        Calendar ca2 = Calendar.getInstance();//创建一个日期的对象
        //ca2.getTime() 是Date类型  ca2.getTime().getTime()得到毫秒
        System.out.println(ca2.getTime().getTime());
        //第二种
        Calendar ca = new GregorianCalendar();
        //ca.getTime() 是Date类型  ca.getTime().getTime()得到毫秒
        System.out.println(ca.getTime().getTime());//当前时间的毫秒
        System.out.println(System.currentTimeMillis());//当前时间的毫秒
        //练习方法  向前推 向后推算日期
        //Calendar.DAY_OF_MONTH 属性 字段 天
        //没加之前
        //System.out.println(ca.get(Calendar.DAY_OF_MONTH));
        //ca.add(Calendar.DAY_OF_MONTH,5);
        //加了之后。  DAY_OF_MONTH表示本月中的某一天
        //System.out.println(ca.get(Calendar.DAY_OF_MONTH));
        System.out.println("----------");
        //Calendar.YEAR年
        System.out.println(ca.get(Calendar.YEAR));
        //MONTH 月
        System.out.println(ca.get((Calendar.MONTH))+1);
        //日
        System.out.println(ca.get(Calendar.DATE));
        //时
        System.out.println(ca.get(Calendar.HOUR));
        //分
        System.out.println(ca.get(Calendar.MINUTE));
        //秒
        System.out.println(ca.get(Calendar.SECOND));
        //从周日开始计,本周是第几天
        System.out.println(ca.get(Calendar.DAY_OF_WEEK));
        System.out.println("-----");
        //向后走一个月
        ca.add(Calendar.MONTH,2);
        System.out.println(ca.get(Calendar.MONTH)+1);
        //如果让把ca 按日期格式输出
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = ca.getTime();//先把ca--->Date
        System.out.println(sd.format(d));
    }
}
