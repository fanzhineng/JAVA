package com.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-29 10:48
 **/
public class Cal3Demo {
    public static void main(String[] args) throws ParseException {
        /*
            控制台中可输入字符串 2019-09-08
            要给Calendar用 并通过Cal向后推2个月加8天
            再用日期格式输出
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期：");
        String str = sc.nextLine();
        //string-->转换成Date
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s.parse(str);
        //Date --> Calender
        //创建Calendar
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        //向后推2个月
        ca.add(Calendar.MONTH,2);
        //加8天
        ca.add(Calendar.DATE,8);
        //Calendar-->Date
        Date time = ca.getTime();
        //Date-->String
        String str2 = s.format(time);
        System.out.println(str2);;
    }
}
