package com.day10;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 *
 * 3 新建一个类，分别用list set
 *   可输入一个字符串，分别得到，去掉重复后的字符，
 * 和重复过的字符.
 * @author: fzn
 * @create: 2020-08-03 18:55
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String str = sc.next();
        char[] ch = str.toCharArray();//转换为char数组
        //调用list
        //getList(ch);
        //调用set
        getSet(ch);
    }
    //使用list
    public static void getList(char[] ch){
        List<Character> li1 = new ArrayList<>();
        List<Character> li2 = new ArrayList<>();
        //去掉重复的后的字符
        for (char c : ch) {
            if (!li1.contains(c)){//是否包含
                li1.add(c);
            }else {
               if (!li2.contains(c)){
                   li2.add(c);
               }
            }
        }
        System.out.println("去掉重复后的字符为:"+li1);
        System.out.println("重复过的字符为:"+li2);
    }
    //使用set
    public static void getSet(char[] ch){
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        //去掉重复的后的字符
        for (char c : ch) {
            boolean b = s1.add(c);
            if (!b){
                s2.add(c);
            }
        }
        System.out.println("去掉重复后的字符为:"+s1);
        System.out.println("重复过的字符为:"+s2);
    }
}
