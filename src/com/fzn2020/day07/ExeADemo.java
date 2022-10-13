package com.fzn2020.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      新建一个文件，可输入一个字符串
 * 2020-01-20 10:09:00
 * 这个代表一个商品的生产日期，
 * 通过Cal去完成，保质是5个月5天5小时.
 * 按格式输出到期时间。
 * @author: fzn
 * @create: 2020-07-29 17:29
 **/
public class ExeADemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的生产日期：");
        String str = sc.nextLine();
        //String -- > Date
        //格式化
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sf.parse(str);//String -- > Date
        //Date --> Calendar
        Calendar ca = Calendar.getInstance();//创建Calendar对象
        ca.setTime(date);//String -- > Date
        ca.add(Calendar.MONTH,5);//加5个月
        ca.add(Calendar.DATE,5);//加5天
        ca.add(Calendar.HOUR,5);//加5小时
        //Calendar --> Date
        Date date1 = ca.getTime();
        //Date --> String
        String str2 = sf.format(date1);
        System.out.println("过期的时间为："+str2);
    }
}
