package com.fzn2020.day02;

/**
 * @program: JAVA
 * 描述：
 *      找出出现次数过半的元素
 * @author: fzn
 * @create: 2020-07-21 14:25
 **/
public class Ary4Demo {
    public static void main(String[] args) {
        int[] ary = new int[]{3,2,6,7,8,2,2,2,9,1,2,2,2};
        //要找出出现次数过半的元素
        //用来表示有无过半的元素。默认没有
        boolean flag = false;
        //用来存放找到的元素。
        int c =0;
        //遍历
        for (int i=0;i<ary.length;i++){
            int count=0;//计数表示出现重复的次数，有重复的，加一
            for (int j=i+1;j<ary.length;j++){
                //如果相等计数
                if (ary[i]==ary[j]){
                    count++;
                }
            }
            if (count>=ary.length/2){
                flag=true;
                c= ary[i];
                break;
            }
        }
        if (flag){
            System.out.println("重复出现过半的元素为:"+c);
        }else {
            System.out.println("没有重复过半的元素");
        }
    }
}
