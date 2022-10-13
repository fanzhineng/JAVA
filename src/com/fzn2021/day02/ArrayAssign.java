package com.fzn2021.day02;

/**
 * @program: JavaSE
 * 描述：      数组传递
 * @author: fzn
 * @create: 2021-12-08 15:06
 **/
public class ArrayAssign {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 10;
        // 会改变数组1的元素  是引用传递
        System.out.println("====arr1的元素===");
        for (int j : arr1) {
            System.out.println(j);
        }

    }
}