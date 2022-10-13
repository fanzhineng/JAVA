package com.fzn2021.day02;

import java.util.Scanner;

/**
 * @program: JavaSE
 * 描述：     数组的缩减
 * @author: fzn
 * @create: 2021-12-08 21:01
 **/
public class ArrayReduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        do {
            int[] newArr = new int[arr.length-1];
            for (int i = 0; i < arr.length - 1; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            System.out.println("====arr 缩减后元素情况====");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            System.out.print("是否继续缩减y/n:");
            char key = scanner.next().charAt(0);
            if( key == 'n') { //如果输入n ,就结束
                break;
            }
            if (arr.length==1){
                System.out.println("数组长度为1 不能缩减");
                break;
            }
        }while (true);
    }
}