package com.day10;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 15:59
 **/
public class DemoB {
    public static void main(String[] args) {
        //可输入一个字符串 有很多字母
        //用集合。得到去掉重复后的字符，其中重复的字符。
        String str = "aaabbbbcccd";
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        char[] ch = str.toCharArray();//转换为char数组
        for (char c : ch) {
            boolean bo = s1.add(c);
            if (!bo) {
                s2.add(c);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
