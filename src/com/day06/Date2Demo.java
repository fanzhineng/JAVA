package com.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-28 16:58
 **/
public class Date2Demo {
    //ParseException 格式异常
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生成日期：");
        String str = sc.next();
        //日期的格式化 先把字符串转换成Date类型
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
         Date d =  sd.parse(str);//异常，如果当输入不按格式进行时
        //到期时间是2个月3天
        d.setMonth(d.getMonth()+2);
        d.setDate(d.getDate()+3);
        String str2 = sd.format(d);
        System.out.println("到期日期为"+str2);
    }

}
