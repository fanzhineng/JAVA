package com.fzn2021.day02;

/**
 * @program: JavaSE
 * 描述：      打印矩形
 *          *
 *        *   *
 *       *     *
 *      *********
 * @author: fzn
 * @create: 2021-12-08 11:57
 **/
public class Rectangle {
    public static void main(String[] args) {
        // 层数
        int totalLevel = 10;

        for (int i = 1; i <= totalLevel; i++) {
            // 打印空格
            for (int j = 1; j <=totalLevel-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j==1 || j == 2*i-1 || i==totalLevel){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}