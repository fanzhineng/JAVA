package com.fzn2021.day02;

/**
 * @program: JavaSE
 * 描述：  数组的翻转
 * @author: fzn
 * @create: 2021-12-08 16:33
 **/
public class ArrayFlip {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        arrayReverse01(arr);
        int[] arr2 = {11,22,33,44,55,66};
        arrayReverse02(arr2);

    }

    /**
     * 传统方法 进行反转
     * @param arr 原数组
     */
    public static void arrayReverse01(int[] arr){
        int temp = 0;
        int len = arr.length; //计算数组的长度
        for( int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];//临时保存
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("===翻转后数组===");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");//66,55,44,33,22,11
        }
        System.out.println();
    }

    /**
     * 逆序赋值
     * @param arr 原数组
     */
    public static void arrayReverse02(int[] arr){
        // 定义一个新数组
        int[] arr2 = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        arr = arr2;
        System.out.println("====arr 的元素情况=====");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");//66,55,44,33,22,11
        }
    }
}