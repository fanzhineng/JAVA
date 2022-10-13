package com.fzn2020.day10;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 16:33
 **/
public class SetDemo {
    public static void main(String[] args) {
        //set->list
        Set<String> ss = new HashSet<>();
        ss.add("aa");
        ss.add("ab");
        ss.add("sun");
        ss.add("cd");
        List<String> li = new ArrayList<>();
        //利用迭代器一个一个拿出来放进去
        Iterator<String> it = ss.iterator();
        while (it.hasNext()){
            li.add(it.next());
        }
        System.out.println(li);
        System.out.println("--------");
        //list -->set 会把重复的过滤掉
        Set<String> se = new HashSet<>();
        se.addAll(li);//一次性把所有的放进去。
        System.out.println(se);
    }
}
