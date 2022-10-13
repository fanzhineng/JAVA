package com.fzn2020.day12;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 10:35
 **/
public class TrDemo {
    public static void main(String[] args) {
        //key排序
        Map<Integer,String> tr1 = new TreeMap<>();
        tr1.put(3,"d");
        tr1.put(4,"b");
        tr1.put(7,"a");
        tr1.put(1,"c");
        System.out.println(tr1);// 1 3 5 7
        System.out.println("-------------");
        //
        Map<String,Integer> tra = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        tra.put("d",3);
        tra.put("b",4);
        tra.put("a",7);
        tra.put("c",1);
        System.out.println(tra);
        System.out.println("----------");
        //Map排序
        Map<String,Integer> tr = new TreeMap<>();
        tr.put("d",3);
        tr.put("b",4);
        tr.put("a",7);
        tr.put("c",1);
        //tr.entrySet() --map得到的set类型
        List<Map.Entry<String,Integer>> ti = new ArrayList<>(tr.entrySet());
        Mc m = new Mc();
        Collections.sort(ti,m);
        //要按value中的数值排序
        System.out.println(ti);
        System.out.println(tr);
    }
}
//Map.Entry 就是map中的一组数据的字体接口
//--是一个map数据接口
class Mc implements Comparator<Map.Entry<String,Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
        return o1.getValue()-o2.getValue();//用map两个数据中的value
    }
}
