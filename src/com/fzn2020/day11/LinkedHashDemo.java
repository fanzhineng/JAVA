package com.fzn2020.day11;

import java.util.LinkedHashMap;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 11:42
 **/
public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>();
        m.put(1,"讨论区");
        m.put(2,"积分区");
        m.put(3,"美食区");
        m.put(4,"休闲区");
        System.out.println(m.size());
        System.out.println(m.get(2));
        System.out.println(m.containsKey(5));
        System.out.println(m.containsValue("积分区"));
        System.out.println(m);
    }
}
