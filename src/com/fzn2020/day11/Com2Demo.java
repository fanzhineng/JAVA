package com.fzn2020.day11;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 17:20
 **/
public class Com2Demo {
    public static void main(String[] args) {
        String s1 = "CFE";
        String s2 = "EGD";
        String s3 = "CCD";
        //默认情况下，当长度相同时比较首字母，当首字母相同时，再比较下一个字母
        //返回类型是一个整数类型   s1 大于s2 返回大于0的数，小于返回小于0的数。
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }
}
