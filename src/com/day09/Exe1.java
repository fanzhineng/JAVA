package com.day09;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 09:41
 **/
public class Exe1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,1};
        re(arr);

    }
    public static void re(int[] arr){
        //如果找到重复元素，放到新数组中
        int[] ar = {};
        try {
            for (int i = 0; i < arr.length; i++) {
                int co =0;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        co++;
                    }
                }
                if (co==1){
                    ar = Arrays.copyOf(ar,ar.length+1);
                    ar[ar.length-1]=arr[i];
                    i = i+co-1;//用来跳过已经重复的循环
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(ar));
    }
}
