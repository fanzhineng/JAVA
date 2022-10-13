package com.fzn2020.day12;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 14:24
 **/
public class ExeA {
    public static void main(String[] args) {
        /*
              可输入字符串 字符串中aaabbccccddd
               要通过Collection 和Map两种方法
               统计出每个字符出现的次数
               要按下面的格式输出a2b2c4d3
         */
        String str = "aaabbccccddd";
       getSet(str);
       // getMap(str);
    }
    //Collection
    public static void getSet(String str) {
        char[] arr = str.toCharArray();
        List<Character> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            li.add(arr[i]);
        }
        for (int i = 0; i < li.size(); i++) {
            int co = 0;
            for (int j = 0; j < arr.length; j++) {
                if (li.get(i)==li.get(j)){
                    co++;
                }
            }
            System.out.println(li.get(i)+""+co+"次");
        }
    }
    //Map
    public static void getMap(String str){
        Map<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (m.keySet().contains(str.charAt(i))){//存过
                m.put(str.charAt(i),m.get(str.charAt(i))+1);//就把value加1
            }else {
                //没有存过
                m.put(str.charAt(i),1);
            }
        }
        System.out.println(m);
    }
}
