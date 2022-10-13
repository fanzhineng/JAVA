package com.day11;

import java.util.Hashtable;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 14:34
 **/
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> h = new Hashtable<>();
        h.put(1,"讨论区");
        h.put(3,"美食区");
        h.put(2,"积分区");
        h.put(4,"休闲区");
        System.out.println(h);
        System.out.println(h.get(2));
        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("美食区"));
    }
}
