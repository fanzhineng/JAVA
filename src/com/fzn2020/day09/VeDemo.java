package com.fzn2020.day09;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 14:42
 **/
public class VeDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(11);
        v.add(12);
        v.add(13);
        //修改
        v.set(1,20);
        v.add(2,15);
        //删除
        v.remove(2);
        System.out.println(v);
        for (Integer x : v) {
            System.out.println(x);
        }
        System.out.println("------------");
        Vector<Integer> v2 = new Vector<>();
        v2.addAll(v);
        System.out.println(v2);
        System.out.println("------------");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(v);
        System.out.println(arr);
        System.out.println("------------");
        /*
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(v);
            报错，类型要一致
         */

    }
}
