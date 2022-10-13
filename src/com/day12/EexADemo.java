package com.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *  2 新建一个类，可输入字符串,通过map能统计每个字符出现的次数
 * @author: fzn
 * @create: 2020-08-05 17:42
 **/
public class EexADemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String str = sc.next();
        //字符串转字符
        char[] chars = str.toCharArray();
        //用map统计出现的次数
        Map<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (m.keySet().contains(chars[i])){//存过
                m.put(chars[i],m.get(str.charAt(i))+1);//就把value加1
            }else {
                //没有存过
                m.put(chars[i],1);
            }
        }
        System.out.println(m);
    }
}
