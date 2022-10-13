package com.day01;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-20 18:32
 **/
public class ExeB {
    public static void main(String[] args) {
        /*
         *可输入一个整数，位数不定
         *把此数倒过来输出，输出的数在一个数中.
         */
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //用户输入
        System.out.print("请输入一个数:");
        int a = sc.nextInt();
        //存放结果
        int res =0;
        while (a>0){
            //存放余数
            int b = a%10;
            res = res*10+b;
            //存放整数
            a = a/10;
        }
        System.out.println("你输入的数的倒序是："+res);
    }
}
