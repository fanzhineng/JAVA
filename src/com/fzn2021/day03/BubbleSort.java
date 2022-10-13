package com.fzn2021.day03;

import java.util.Arrays;

/**
 * @program: JavaSE
 * 描述：  冒泡排序
 *      先死后悔
 * @author: fzn
 * @create: 2021-12-09 20:19
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, -1, 30, 200, -110};

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数>后面的数，就交换
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // 排序之后的数组
        System.out.println(Arrays.toString(arr));

    }
}