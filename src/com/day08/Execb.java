package com.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：      格式化异常，
 * @author: fzn
 * @create: 2020-07-30 15:32
 **/
public class Execb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sd.parse(str);
            System.out.println(d.getTime()+1900);
        } catch (ParseException e) {
            //e.printStackTrace();//打印异常信息
            System.out.println("请按照正确格式输入");
        }finally {
            System.out.println("finally");
        }
    }
}
