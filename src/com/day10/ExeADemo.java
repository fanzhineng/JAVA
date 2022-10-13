package com.day10;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 *          2 新建一个类，分别用list set,
 *   对于一个随机数，100以内，把随机数中放入10个不重复的偶数。
 *
 * @author: fzn
 * @create: 2020-08-03 18:49
 **/
public class ExeADemo {
    public static void main(String[] args) {
        //调用list
        //getList();
        //调用set
        getSet();
    }
    //使用list
    public static void getList(){
        List<Integer> li = new ArrayList<>();
        //创建随机对象
        Random rd = new Random();
        while (li.size()<10){
            int n = rd.nextInt(100);
            if (!li.contains(n) && n%2==0){
                li.add(n);
            }
        }
        System.out.println(li);
    }
    //使用set
    public static void getSet(){
        Set<Integer> se = new HashSet<>();
        //创建随机对象
        Random rd = new Random();
        while (se.size()<10){
            int n = rd.nextInt(100);
            if ( n%2==0){//偶数
                se.add(n);
            }
        }
        System.out.println(se);
    }
}
