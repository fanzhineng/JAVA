package com.fzn2021.day01;

/**
 * @program: JavaSE
 * 描述：      位运算
 * @author: fzn
 * @create: 2021-12-07 16:28
 **/
public class BitOperation {
    public static void main(String []args) {
        // 2的原码 00000000    00000000    00000000    00000010
        // 2的补码 00000000    00000000    00000000    00000010
        // 3的原码 00000000    00000000    00000000    00000011
        // 3的补码 00000000    00000000    00000000    00000011
        // 按位&  补码运算
        //  00000000    00000000    00000000    00000010
        //  00000000    00000000    00000000    00000011
        // ------------------------------------------------
        //  00000000    00000000    00000000    00000010   = 2
        System.out.println(2&3);
        System.out.println(~-2);
        System.out.println(~2);
        System.out.println(2|3);
        System.out.println(2^3);
        System.out.println("-------------");
        int a=1>>2; // 1 向右位移2 位
        int b=-1>>2;//算术右移
        int c=1<<2;//算术左移
        int d=-1<<2;
        int e=3>>>2;//无符号右移
        // a,b,c,d,e 结果是多少
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);

        System.out.println((-10.4%3));
        System.out.println((-10.4%3)==-1.4);

        System.out.println((-10.5%3));
        System.out.println((-10.5%3)==-1.5);

        int i = 66;
        System.out.println(++i+i);


    }
}