package com.fzn2021.day04;

import java.util.Arrays;

/**
 * @program: JavaSE
 * 描述：  二维数组
 * @author: fzn
 * @create: 2021-12-10 16:24
 **/
public class TwoDimensionalArray01 {
    /*
        请用二维数组输出如下图形
        0 0 0 0 0 0
        0 0 1 0 0 0
        0 2 0 3 0 0
        0 0 0 0 0 0
    */
    public static void main(String[] args) {
        int[][] arr = { {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0,2, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0} };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}