package com.fzn2020.day10;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 15:27
 **/
public class TreeItDemo {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("aaa");
        tr.add("abb");
        tr.add("bbb");
        tr.add("acc");
        tr.add("add");
        //按照顺序输出
        System.out.println(tr);
        System.out.println("-------");
        //按顺序迭代器
        Iterator<String> ia = tr.iterator();
        while (ia.hasNext()){
            System.out.println(ia.next());
        }
        System.out.println("------------");
        //按照倒序输出
        Iterator<String> ib = tr.descendingIterator();
        while (ib.hasNext()){
            System.out.println(ib.next());
        }
    }
}
