package com.fzn2020.day03;

import sun.misc.InnocuousThread;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      新建一个java文件，有二个数组，数组内容是都是整数值，
 *      要用二个方法完成，比对二个数组是相同的
 * @author: fzn
 * @create: 2020-07-22 19:41
 **/
public class CompareAry {
    public static void main(String[] args) {
        int[] arr1= new int[]{1,3,5,7,8};
        int[] arr2 = new int[]{1,5,7,3,8};
        //比较
        //compare(arr1,arr2);
        //数组中的方法比较
        boolean bo = Arrays.equals(arr1,arr2);
        System.out.println(bo);

    }
    //1.比较数组
    public static  void compare(int[] arr1,int[] arr2){
        boolean f=true;
        //判断长度是否相同
        if (arr1.length!=arr2.length){//长度不等直接false
            f = false;
        }else if (arr1.length==0 && arr2.length==0){//判断是否是空数组。
            f = true;
        }else {
            for (int i=0;i<arr1.length;i++){
                if (arr1[i]!=arr2[i]){
                    f = false;
                }
            }
        }
        if (f){
            System.out.println("两个数组中的内容都相等");
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        }else {
            System.out.println("两个数组中内容的不同");
        }
    }
}

