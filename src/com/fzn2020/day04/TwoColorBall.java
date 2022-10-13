package com.fzn2020.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: JAVA
 * 描述：
 *      新建一个类，通过自定义方法和数组，发出6个数字不同的双色球出来。
 *   (数字范围在0..30)
 * @author: fzn
 * @create: 2020-07-24 18:51
 **/
public class TwoColorBall {
    public static void main(String[] args) {
        int[] ary = get(6);
        System.out.println(Arrays.toString(ary));
    }
    //发出数
    public static int[] get(int num){
        //创建随机数对象
        Random r = new Random();
        //数组 存放产生的数字
        int[] t = new int[6];
        int count =0;
        for (int i=0;i<num;i++){//轮
            boolean f=true;
            int a=r.nextInt(31);
            for (int j=0;j<count;j++){
                if (a==t[j]){
                    f =false;
                    i--;
                    break;
                }
            }
            if (f){
                t[count]=a;
                count++;
            }
        }
        return t;
    }
}
