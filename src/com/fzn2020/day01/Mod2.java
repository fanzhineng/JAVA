package com.fzn2020.day01;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      练习：通过输入 三元运算符 自定义方法
 *      判断是不是闰年
 *      1.直接整除400
 *      2.能整除4，不能整除100
 * @author: fzn
 * @create: 2020-07-20 14:16
 **/
public class Mod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean t = isYear(x);
        if(t){
            System.out.println(x+"是闰年");
        }else {
            System.out.println(x+"不是闰年");
        }
    }
    //判断是否是闰年
    public static boolean isYear(int y){
        boolean isY= (y%4==0&&y%100!=0) || (y%400==0) ?true:false;
        return isY;
    }
}
