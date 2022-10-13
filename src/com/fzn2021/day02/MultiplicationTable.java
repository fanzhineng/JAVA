package com.fzn2021.day02;

/**
 * @program: JavaSE
 * 描述：  99乘法表
 * @author: fzn
 * @create: 2021-12-08 11:48
 **/
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" * "+i+" = "+(i*j)+"\t\t");
            }
            System.out.println();
        }
    }
}