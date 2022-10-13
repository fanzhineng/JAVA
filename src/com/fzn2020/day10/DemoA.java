package com.fzn2020.day10;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 15:33
 **/
public class DemoA {
    public static void main(String[] args) {
        /*
        分别用list set 两种类型完成 通过随机数（0~99） 存入集合中，要不重复的值。存入20个
         */
        //getList();
        getSet();

    }
    //使用list
    public static void getList(){
        List<Integer> li = new ArrayList<>();
        Random rd = new Random();
        //20个就满了
        while (li.size()<20){
            int n = rd.nextInt(100);
            if (!li.contains(n)){
                li.add(n);
            }
        }
        System.out.println(li);
    }
    //set
    public static void getSet(){
        Set<Integer> ha = new HashSet<>();
        Random rd = new Random();
        //20个就满了
        while (ha.size()<20){
            int n = rd.nextInt(100);
            ha.add(n);
        }
        System.out.println(ha);
    }
}
