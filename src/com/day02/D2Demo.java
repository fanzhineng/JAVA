package com.day02;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-21 10:00
 **/
public class D2Demo {
    /*
     * 有一对兔子，默认公母是成对的。
     * 第三个月开始，每一对会新生一对，
     * 新生的兔子，也是第三个月开始，每个月新生一对
     * 老的只要超过三个月也还在生
     * 问，第12个月，共有多少对兔子。
     * 1 1
     * 2 1
     * 3 2
     * 4 3
     * 5 5
     * 6 8
     * */
    public static void main(String[] args) {
        int re = x(12);
        System.out.println(re);
    }
    public static int x(int i){
        if (i==1 || i==2){
            return 1;
        }else {
            return x(i-1)+x(i-2);
        }
    }
}
