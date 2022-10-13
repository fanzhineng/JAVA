package com.fzn2020.day07;

/**
 * @program: JAVA
 * 描述：
 *      String
 * @author: fzn
 * @create: 2020-07-29 11:16
 **/
public class StringDemo {
    public static void main(String[] args) {
        //在字符串中 == 比地址  equals 比内容
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);//t
        System.out.println(str1.equals(str2));//t
        System.out.println("------1------");
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str4 == str3);//f
        System.out.println(str3.equals(str4));//t
        System.out.println(str1.equals(str3));//t
        System.out.println("------2------");
        String ss1= "abc";
        String ss2 = "ab";
        String ss3 = ss2 + "c";
        String ss4 = "c";
        String ss5 = ss2 + ss4;
        System.out.println(ss1 ==  ss2);//f
        System.out.println(ss1 == ss3);//f
        System.out.println(ss1.equals(ss3));//t
        System.out.println(ss1 == ss5);//f
        System.out.println(ss3 == ss5);//f
        System.out.println(ss3.equals(ss5));//t
        System.out.println("------3----");
        //常用方法
        String s6 = "ABCabcd中国";
        String s7 = s6.toUpperCase();//大写
        String s8 = s6.toLowerCase();//小写
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s6.equals(s7));//f
        System.out.println(s6 == s7);//f

    }
}
