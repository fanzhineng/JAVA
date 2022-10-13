package com.fzn2020.day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-21 18:51
 **/
public class ExeBDemo {
    /*
    * 新建java文件，完成冒泡排序，选择排序，插入排序，快速排序。
    * */
    public static void main(String[] args) {
        int[] arr = new int[5];
        //创建scanner对象 让用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入5个数:");
        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //冒泡排序
        //bu(arr);
        //选择排序
        //sel(arr);
        //插入排序
        //in(arr);
        //快速排序
        qu(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    //快速排序方法
    //参数列表：arr数组 low最小下标 hi最大下标
    public static int getM(int[] arr,int low,int hi){
        int t = arr[low];//假设第一个是中间数
        while (low<hi){
            //中间数右边
            while (low<hi && arr[hi]>=t){//右边的比中间数大 数不动，指针移动
                hi--;
            }
            //右边的数比中间数小 放到中间数左边去
            arr[low]=arr[hi];
            //中间数左边
            while (low<hi && arr[low]<t){//左边的比中间数小 数不动，指针移动
               low++;
            }
            //左边的数比中间数da 放到中间数右边去
            arr[hi]=arr[low];
        }
        //得到中间数的下标
        arr[low]=t;
        return low;
    }
    //递归调用快速排序方法
    public static void qu(int[] arr,int low,int hi){
        if (low<hi){
            //得到中间数
            int m = getM(arr,low,hi);
            //左右两边同时执行
            qu(arr,low,m-1);
            qu(arr,m+1,hi);
        }
    }

    //插入排序方法
    public static void in(int[] arr){
        for (int i=1;i<arr.length;i++){//控制无序的数组 i从1开始
            int t = arr[i];//存放t
            for (int j=i-1;j>=0;j--){//控制有序的数组。j从i上一个元素开始
                if (arr[j]>t){
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }

        }
    }
    //选择排序方法
    public static  void sel(int[] arr){
        for (int i=0;i<arr.length;i++){//i控制是第一个元素
            for (int j=i+1;j<arr.length;j++){//j控制的是后面的元素
                if (arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    //冒泡排序方法
    public static void bu(int[] arr){
        for (int i=0;i<arr.length-1;i++){//i控制要比较的轮数
            for (int j=0;j<arr.length-1-i;j++){//控制下标
                if(arr[j]>=arr[j+1]){
                    int t = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}
