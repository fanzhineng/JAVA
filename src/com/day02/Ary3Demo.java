package com.day02;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      练习
 * @author: fzn
 * @create: 2020-07-21 11:46
 **/
public class Ary3Demo {
    public static void main(String[] args) {
        //静态数组，没有长度
        int[] ary ={};
        //在下面补充不超过四行的代码
        //先把长度变为10
        ary = Arrays.copyOf(ary,ary.length+10);
        for (int i=0;i<10;i++){
            ary[i]=11+i;
        }
        System.out.println(Arrays.toString(ary));
        //11,12...20
    }
}
