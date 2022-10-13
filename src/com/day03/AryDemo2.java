package com.day03;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      找出重复的元素并把它放到新数组中。
 * @author: fzn
 * @create: 2020-07-22 10:56
 **/
public class AryDemo2 {
    public static void main(String[] args) {
        int[] ary = new int[]{5,4,4,5,5,5,2,2,2,6,7,8,11,10};
        Arrays.sort(ary);
        int[] ary2 = getC(ary);
        System.out.println(Arrays.toString(ary2));
    }
    public static int[] getC(int[] ary){
        int[] reAry = {};//新数组
        int co;//计数
        //遍历
        for (int i=0;i<ary.length;i++){
            co=0;
            for (int j=i+1;j<ary.length;j++){
                if (ary[i]==ary[j]){//如果有相等的加一
                    co++;
                }
            }
            if (co>0){
                reAry = Arrays.copyOf(reAry,reAry.length+1);
                reAry[reAry.length-1]=ary[i+co];
                i = i+co;
            }
        }
        return reAry;
    }
}
