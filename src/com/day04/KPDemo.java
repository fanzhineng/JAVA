package com.day04;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-24 14:31
 **/
public class KPDemo {
    public static void main(String[] args) {

    }
    public int kar(int[]s ,int l,int r){
        //用来控制下标
        int i=l;
        int j=r;
        //把第一个数当成中间数
        int x = s[l];
        while (i<j){
            //右边
            while (i<j && s[j] >=x){
                j--;
            }
            if(i<j){//比他小的
                s[i]=s[j];
            }
            //左边
            while (i<j && s[i] <x){
                i++;
            }
            if (i<j){
                s[j]=s[i];
            }
        }
        s[i] = x;
        return i;
    }
}
