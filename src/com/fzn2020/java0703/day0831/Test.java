package com.fzn2020.java0703.day0831;

/**
 * @program: JAVA
 * 描述：      测试
 * @author: fzn
 * @create: 2020-09-02 09:09
 **/
public class Test extends Object{
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s==s1);//false
        System.out.println(s1==s2);//true    false
        System.out.println(s.equals(s1));//false    true
        System.out.println(s1.equals(s2));//true
        System.out.println("-----------");
        StringBuffer s3 = new StringBuffer("hello");
        StringBuffer s4 = new StringBuffer("hello");
        System.out.println(s1.equals(s3));//false
        System.out.println(s3.equals(s4));//false
    }
}
