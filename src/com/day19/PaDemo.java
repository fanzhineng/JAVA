package com.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: JAVA
 * 描述：      Java正则表达式
 * @author: fzn
 * @create: 2020-08-14 09:32
 **/
public class PaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();//你输入的内容，要判断此内容中有没有含m
        //写规则
        //String patt = "^\\d+$";//正整数
        //全是字母组成
        //String patt = "^[A-Za-z]+$";
        //由字母和数字组成
        //String patt = "^[A-Za-z0-9]+$";
        //判断是否手机号码
        //String patt = "^1[0-9]{10}$";
        //判断输入是否为中文
        //String patt = "[\\u4e00-\\u9fa5]";
        //邮政编码
        //String patt = "^\\d{6}$";
        //电话区号
        //String patt = "^0[0-9]{2,3}$";
        //邮箱
        String patt = "^[0-9A-Za-z]+@[0-9A-Za-z]+.[0-9A-Za-z]+$";
        //Pattern 规则类  正则表达式的编译表示
        //compile 把你写的规则放进去
        Pattern pattern = Pattern.compile(patt);
        //匹配器 :提供了方法开始匹配
        //把已知字符串和正则表达式，都放到匹配器中
        Matcher ma = pattern.matcher(content);

        //开始匹配
        if (ma.find()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
