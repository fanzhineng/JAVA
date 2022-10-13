package com.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * 新建文件，可输入上学时间，2019-09-01 08:00:01
 *    5天6小时后，放假，按格式.输出放假时间。
 * @author: fzn
 * @create: 2020-07-28 18:45
 **/
public class DateExeDemo {
    //抛出格式异常ParseException
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);//创建对象
        System.out.println("请输入上学的时间：");
        String str = sc.nextLine();//接收输入的内容
        //日期格式化5
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = s.parse(str);//会发生异常，抛出 把字符转换成date
        date.setDate(date.getDate()+5);//加5天
        date.setHours(date.getHours()+6);//加6小时
        String str2 = s.format(date);//把date转换成字符
        System.out.println("放学的时间是："+str2);
    }
}
