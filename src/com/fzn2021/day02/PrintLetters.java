package com.fzn2021.day02;

/**
 * @program: JavaSE
 * 描述：  打印26个字母
 * @author: fzn
 * @create: 2021-12-08 13:26
 **/
public class PrintLetters {
    public static void main(String[] args) {
        // 答打印26个字母
        print();
        // 求一个数组中最大的值
        maxIndex();
    }

    public static void print(){
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' +i);
            System.out.print(chars[i]+"\t");
        }
        System.out.println();
    }

    public static  void  maxIndex(){
        int[] arr = {4,-1,9,10,23};
        // 假设max是最大的
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值是："+max+" 下标是："+maxIndex);
    }
}