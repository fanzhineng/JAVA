package com.day01;

/**
 * @program: JAVA
 * 描述：
 *      i++和++i     自增
 * @author: fzn
 * @create: 2020-07-20 14:36
 **/
public class IDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        int c = 1;
        int d = ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("-----");
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
