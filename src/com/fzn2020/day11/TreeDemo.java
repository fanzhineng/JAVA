package com.fzn2020.day11;

import java.util.Map;
import java.util.TreeMap;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 11:24
 **/
public class TreeDemo {
    public static void main(String[] args) {
        Map<Integer,String> mm = new TreeMap<>();//多态
        mm.put(1,"讨论区");
        mm.put(2,"积分区");
        mm.put(3,"美食区");
        mm.put(4,"休闲区");
        System.out.println(mm.size());
        System.out.println(mm.get(1));
        //修改
        mm.put(2,"积分2");
        System.out.println(mm.get(2));
        //删除
        mm.remove(2);
        System.out.println(mm.get(2));
        //是否含有
        System.out.println(mm.containsKey(1));
        System.out.println(mm.containsValue("积分区"));
    }
}
