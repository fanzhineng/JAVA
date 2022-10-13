package com.day10;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 14:11
 **/
public class LinkDemo {
    public static void main(String[] args) {
        HashSet<String> ha = new LinkedHashSet<>();
        ha.add("aa");
        ha.add("sun");
        ha.add("aa");
        ha.add("li");
        ha.add("hi");
        for (String s : ha) {
            System.out.println(s);
        }
        System.out.println("-----------");
        //Integer
        HashSet<Integer> hi = new LinkedHashSet<>();
        hi.add(11);
        hi.add(121);
        hi.add(3);
        hi.add(131);
        hi.add(5);
        System.out.println(hi);
        System.out.println("------------");
        //类
        HashSet<Student> s = new LinkedHashSet<>();
        Student s1 = new Student("sun",18,362201);
        Student s2 = new Student("li",18,362202);
        Student s3 = new Student("zao",18,362203);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        for (Student st : s) {
            System.out.println(st);
        }
        System.out.println("------删除后------");
        //删除
        s.remove(s1);
        for (Student st : s) {
            System.out.println(st);
        }


    }
}
