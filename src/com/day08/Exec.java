package com.day08;

/**
 * @program: JAVA
 * 描述：      数组下标越界异常
 * @author: fzn
 * @create: 2020-07-30 15:42
 **/
public class Exec {
    public static void main(String[] args) {
        try {
            int[] ary = new int[]{11,12,13,14,16};
            for (int i = 0; i < ary.length+1; i++) {
                System.out.println(ary[i]);
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("数组下标要注意");
        }
    }
}
