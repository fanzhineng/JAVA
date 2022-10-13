package com.fzn2020.day14;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      排序算法
 * @author: fzn
 * @create: 2020-08-07 14:08
 **/
public class PDemo {
    public static void main(String[] args) {
        int[] ary = new int[]{101,5,3,6,4,7,9,10,6};
        //冒泡排序
        //bu(ary);
        //选择排序
        //se(ary);
        //ins(ary);
        qu(ary,0,ary.length-1);
        System.out.println(Arrays.toString(ary));

    }
    //冒泡排序
    /*
        就是每两个比较 然后交换位置
     */
    public static void bu(int[] ary){
        //
        int c= 0;//中间变量
        for (int i = 0; i < ary.length-1; i++) {//控制下标
            for (int j = 0; j < ary.length-1; j++) {
                    if (ary[j]>ary[j+1]){
                    c = ary[j+1];
                    ary[j+1] = ary[j];
                    ary[j] = c;
                }
            }
        }
    }
    /*
        选择排序：
           思路：每次都是第一个和其他的比较，第一轮最小的在前面
            n-1之后出结果
     */
    public static void se(int[] ary){
        //第一个循环控制第一个元素
        int c=0;//中间变量
        for (int i = 0; i < ary.length; i++) {
            //第二个循环控制后面的元素
            for (int j = i+1; j < ary.length; j++) {
                if (ary[i]>ary[j]){
                    c = ary[j];
                    ary[j] = ary[i];
                    ary[i] = c;
                }
            }
        }
    }
    /*
        插入排序：
            把数组看成分割成两个数组 一个有序 一个无序
     */
    public static void ins(int[] ary){
        //
        //零时变量
        int t=0;
        for (int i = 1; i < ary.length; i++) {//从第二个元素开始 控制第二个
            //把元素取出来
            t = ary[i];
            for (int j = i-1;j>=0; j--) {//有序的数组
                if(ary[j]>t){//如果j比t大 j的就到下一个位置 t到j原来的位置
                    ary[j+1] = ary[j];
                    ary[j] = t;
                }
            }
        }
    }
    /*
        快速排序：   找中间数，如果比中间数大就放到左边，比中间数小就放大右边
        默认把第一个当成中间数
     */
    public static int fa(int[] ary,int low,int hi){
        //先把第一个元素取出来 当成中间数
        int t =ary[low];
        while (low<hi){
            //右边的数
            while (low<hi && ary[hi]>t){//右边的数比中间数大，不用动 下标左移
                hi--;
            }
            //如果右边的比t小 就放到t的左边
            ary[low] = ary[hi];
            //左边的数
            while (low<hi && ary[low]<=t){
               low++;
            }
            ary[hi] = ary[low];
        }
        ary[low] = t;
        return low;//返回下标
    }
    //利用递归调用执行
    public static void qu(int[] ary,int low,int hi){
        if (low<hi){
            int m = fa(ary,low,hi);//得到中间数。
            qu(ary,low,m-1);
            qu(ary,m+1,hi);
        }
    }

}

