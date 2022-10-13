package com.fzn2020.day10;

import java.util.Set;
import java.util.TreeSet;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 14:35
 **/
public class TreeDemo {
    public static void main(String[] args) {
        //String
        TreeSet<String> se = new TreeSet<>();
        se.add("aa");
        se.add("sun");
        se.add("ab");
        se.add("bb");
        se.add("cd");
        System.out.println(se);//有序
        //删除并得到第一个元素
        String va = se.pollFirst();
        System.out.println(va);
        System.out.println(se);
        //删除最后一个并返回最后一个元素
        String vb = se.pollLast();
        System.out.println(vb);
        System.out.println(se);
        //清空
        se.clear();//把整个集合中的元素清空
        System.out.println(se);
        System.out.println(se.isEmpty());//检测是否为空
        System.out.println("-------------");
        //Integer
        Set<Integer> se2 = new TreeSet<>();//按数值的序      //动态
        se2.add(11);
        se2.add(2);
        se2.add(121);//会自动过滤重复值
        se2.add(121);
        se2.add(112);
        System.out.println(se2);//按照数值的序排序
        System.out.println(se2.size());//长度


    }
}
