package com.day01;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      自定义方法
 *      形参和实参
 *      有无返回值
 * @author: fzn
 * @create: 2020-07-20 11:49
 **/
public class Mod {
    public static void main(String[] args) {
        //调用得到周长方法
        /*
       int c = getZ(2,3);
        System.out.println(c);
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        del(x);
    }
    //有返回值
    //得到周长。
    //形参:为了完成功能吗，假定的值，参数前要加类型
    // 实参:真实使用的值
    // public  static通过方法名调用
    public  static int getZ(int a,int b){
        int c = (a+b)*2;
        return c;
    }
    //无返回值 删除一个数
    public static  void del(int i){
        if (i==8080){
            System.out.println("已删除");
        }
    }

}
