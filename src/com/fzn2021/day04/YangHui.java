package com.fzn2021.day04;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-10 17:27
 **/
public class YangHui {
    public static void main(String[] args) {
        /*
            使用二维数组打印一个10 行杨辉三角
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1
            1 5 10 10 5 1
         */
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {//遍历yangHui 的每个元素
            //给每个一维数组(行) 开空间
            yangHui[i] = new int[i + 1];
            //给每个一维数组(行) 赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {//中间的元素
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }
        //输出杨辉三角
        for (int[] ints : yangHui) {
            for (int anInt : ints) {//遍历输出该行
                System.out.print(anInt + "\t");
            }
            System.out.println();//换行.
        }
    }
}