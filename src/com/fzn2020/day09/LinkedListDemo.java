package com.fzn2020.day09;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 11:39
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();//多态
        li.add("sun");
        li.add("aun");
        li.add("cun");
        li.addFirst("asu");
        li.addLast("csu");
        for (String l : li) {
            System.out.println(l);
        }
        System.out.println("---------------");
        li.remove(2);//删除下标为2的元素
        System.out.println(li.get(2));//去下标为2的元素
        System.out.println(li.getFirst());//取第一个
        System.out.println(li.getLast());//取最后一个
        li.set(1,"xx");//把第一个设置为xx
        System.out.println(li);


    }
}
