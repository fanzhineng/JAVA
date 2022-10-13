package com.fzn2020.day03;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      去掉重复的元素 显示新的数组。
 * @author: fzn
 * @create: 2020-07-22 10:24
 **/
public class AryDemo {
    public static void main(String[] args) {
        //已知一个数组，通过程序设计，完成 去除掉重复元素。
        //留下不重复元素在数组中，可定义数组。
        int[] ary = new int[]{5,4,4,5,5,5,2,2,2,6,7,8,11,10};
        Arrays.sort(ary);
        int[] ary2 = getC(ary);
        System.out.println(Arrays.toString(ary2));
    }
    public static int[] getC(int[] ary){
        int[] reAry = {};//定义一个新数组
        int co;//计数,判断相同的计数
        for (int i=0;i<ary.length;i++){
            co = 0;
            for (int j=i+1;j<ary.length;j++){
                if (ary[i]==ary[j]){
                    co++;
                }
            }
            reAry = Arrays.copyOf(reAry,reAry.length+1);
            reAry[reAry.length-1]=ary[i+co];
            i = i+co;
        }
        return reAry;
    }
}
