package com.fzn2021.day02;

/**
 * @program: JavaSE
 * 描述：  数组的复制
 * @author: fzn
 * @create: 2021-12-08 16:23
 **/
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};

        // 开辟一个新的空间
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[0] = 100;
        //输出arr1
        System.out.println("====arr1 的元素====");
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);//10,20,30
        }
        //
        System.out.println("====arr2 的元素====");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//
        }

    }
}