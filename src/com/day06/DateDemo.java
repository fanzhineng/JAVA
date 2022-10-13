package com.day06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-28 16:10
 **/
public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date(0);//默认传一个0 表示初始化默认值开始1970
        System.out.println(d);
        //如果不用传0 表示现在的程序所在的服务器时间
        Date d2 = new Date();
        System.out.println(d2);
        //运用方法
        System.out.println(d2.getYear()+1900);//在1970计起，1900//年
        System.out.println(d2.getMonth()+1);//月份 0~11代表12个月 所有要加+1
        System.out.println(d2.getDate());//日
        System.out.println("---");
        System.out.println(d2.getHours());//小时
        System.out.println(d2.getMinutes());//分
        System.out.println(d2.getSeconds());//秒
        System.out.println("----------");
        //向后推5天 日期的累加
        System.out.println(d2);
        d2.setDate(d2.getDate()+5);
        System.out.println(d2.getMonth()+1);
        System.out.println(d2.getDate());
        //在此时，小时加3
        d2.setHours(d2.getHours()+3);
        System.out.println(d2.getHours());
        System.out.println(d2);
        //d2在此时 再向前推20s
        //Time 毫秒
        //用time的方式 再向后走5天
        d2.setTime(d2.getTime()+1000*60*60*24*5);
        System.out.println(d2);

        //格式化：处理日期的格式  SimpleDateFormat
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*
            处理日期格式的类sf 格式化方法format ,把日期类型d2 转化成str
        */
        String str = sf.format(d2);
        System.out.println(str);

        /*
        把字符串解析成Date类型parse
         */
    }
}

