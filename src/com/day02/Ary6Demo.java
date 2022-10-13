package com.day02;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      排序算法
 * @author: fzn
 * @create: 2020-07-21 15:24
 **/
public class Ary6Demo {
    public static void main(String[] args) {
        int[] ary = new int[]{8,2,3,7,1,6};
        //Arrays.sort(ary);//api提供的排序，无返回值。
        //System.out.println(Arrays.toString(ary));
        //冒泡排序
        //bull(ary);
        //System.out.println(Arrays.toString(ary));
        //选择排序
        //sel(ary);
        //System.out.println(Arrays.toString(ary));
        //插入排序
        //inSort(ary);
        //快速排序
        qu(ary,0,ary.length-1);
        System.out.println(Arrays.toString(ary));
    }

    //冒泡排序
    public static void bull(int[] ary){
        int c = 0;
        for (int i=0;i<ary.length-1;i++){//i用来控制比几轮
            //-i表示前面比完了后面就不用比了
            for (int j=0;j<ary.length-1-i;j++){//j用来控制下标
                if (ary[j]>ary[j+1]){
                    c = ary[j+1];
                    ary[j+1]=ary[j];
                    ary[j]=c;
                }
            }
        }
    }
    //选择排序
    public static void sel(int[] ary){
        for (int i=0;i<ary.length;i++){//i用来控制第一个元素
            //j=i+1 j是从i后面的元素开始
            for (int j=i+1;j<ary.length;j++){//j用来控制除去第一元素的后面元素
                if (ary[i]>ary[j]){
                    int c = ary[j];
                    ary[j]=ary[i];
                    ary[i]=c;
                }
            }
        }
    }
    //插入排序
    public static void inSort(int[] ary){
        int t;
        int j;
        for (int i=1;i<ary.length;i++){//i表示从第2个元素开始
            //取出来放到临时位置t
            t = ary[i];
            for (j=i-1;j>=0;j--){//j表示i前面的元素 + t和j每一个元素都比较了
                if (ary[j]>t){//如果大 j就向下移一个 t到j的位置
                    ary[j+1] = ary[j];
                    ary[j]=t;
                }
            }
        }
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
