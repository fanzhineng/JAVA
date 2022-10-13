package com.day02;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-21 19:33
 **/
public class ExeCDemo {
    /*
    * 有余力，新建一个java文件，通过随机数，
    *用循环，发出52个不重复的数出来。无序的.
    * */
    public static void main(String[] args) {
        //创建数组
        /*
        int[] arr = new int[52];
            for (int i=0;i<arr.length;i++){
                arr[i] =(int) (Math.random()*100);
                //对比数组之前的值是否存在相同
                for (int j=0;j<i;j++){
                    if (arr[i]==arr[j]){
                        i--;
                        break;
                    }
                }
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        */
        int[] arr = getC();
        System.out.println(Arrays.toString(arr));
    }
    public  static int[] getC(){
        int[] ary = new int[52];
        for (int i=0; i<ary.length;i++){
            ary[i]=i+1;
        }
        //打乱
        int t = 0;//存放临时数
        Random rd = new Random();
        for(int j=0;j<ary.length;j++){
            //随机生成下标 0~51
            int r = rd.nextInt(52);
            t = ary[r];
            ary[r]=ary[j];
            ary[j]=t;
        }
        return ary;
    }
}
