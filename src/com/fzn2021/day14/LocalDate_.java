package com.fzn2021.day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @program: JavaSE
 * 描述：第三代日期类
 * @author: fzn
 * @create: 2022-01-09 18:00
 **/
public class LocalDate_ {
    public static void main(String[] args) {
        // 当前日期时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //2. 使用DateTimeFormatter 对象来进行格式化
// 创建DateTimeFormatter 对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        LocalDate now = LocalDate.now(); //可以获取年月日
        LocalTime now2 = LocalTime.now();//获取到时分秒
        //提供plus 和minus 方法可以对当前时间进行加或者减
        //看看890 天后，是什么时候把年月日-时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890 天后=" + dateTimeFormatter.format(localDateTime));
        //看看在3456 分钟前是什么时候，把年月日-时分秒输出
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456 分钟前日期=" + dateTimeFormatter.format(localDateTime2));
    }
}