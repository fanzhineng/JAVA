package com.fzn2021.day03;

import java.util.Arrays;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-10 18:14
 **/
public class A {
    public static void main(String[] args) {
        int[] ary = new int[]{24, 69, 80, 57, 13, -1, 30, 200, -110};;
        //快速排序
        qu(ary,0,ary.length-1);
        System.out.println(Arrays.toString(ary));
    }
    //快速排序:原数组，最小下标，最大下标
    public static int getM(int[] ary,int low,int hi){
        //先把第一个元素取出来
        int t = ary[low];//假设中间数为t
        while (low<hi){
            while (low<hi && ary[hi]>t){//右边的数比t大 不动，光标移动
                hi--;
            }
            //遇到比t小的向左移
            ary[low]=ary[hi];
            while (low<hi && ary[low]<t){//左边的数比t小不动,光标移动。
                low++;
            }
            //遇到比t大的先右移
            ary[hi]=ary[low];
        }
        ary[low]=t;
        return low;//返回下标
    }
    //递归调用快速排序
    public static void qu(int[] ary,int low,int hi){
        if (low<hi){
            int m = getM(ary,low,hi);//得到中间数。
            qu(ary,low,m-1);
            qu(ary,m+1,hi);
        }
    }
}