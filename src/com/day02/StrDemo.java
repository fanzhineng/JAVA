package com.day02;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-21 14:09
 **/
public class StrDemo {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        //返回指定的索引数
        //System.out.println(str.charAt(0));
        //1.找出b所在的位置，把位置放到一个新数组中，并输出。
        //定义一个新数组用来存放 空数组
        int[] ary={};
        for (int i=0;i<str.length();i++){
            //取到每一位char
            char ch = str.charAt(i);
            if (ch=='b'){
                //System.out.println(i);
                //让数组的长度加一
                ary = Arrays.copyOf(ary,ary.length+1);
                //要放到最后一个位置
                ary[ary.length-1] = i;
            }
        }
        System.out.println(Arrays.toString(ary));

    }
}
