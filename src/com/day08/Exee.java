package com.day08;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-30 16:50
 **/
public class Exee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            foo(x,y);
        } catch (ArithmeticException e) {
            //e.printStackTrace();  ArithmeticException: / by zero
            System.out.println("算术异常");
        }
        System.out.println();
    }
    public static void foo(int x, int y){
        int a = x/y;
        //当有异常的时候，后面的代码，焦点失去了 不会再执行了。
        System.out.println("我是异常后面的代码");
    }
}
