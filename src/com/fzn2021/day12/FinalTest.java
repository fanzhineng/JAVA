package com.fzn2021.day12;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-04 14:05
 **/
public class FinalTest {
    public static void main(String[] args) {
        System.out.println(AAA.num);
        System.out.println("----------");
        System.out.println(BBB.num);
    }
}
class AAA {
    public  static int num = 10000;
    static {
        System.out.println("AAA 静态代码块被执行");
    }
}
class BBB {
    public final static int num = 10000;
    static {
        System.out.println("BBB 静态代码块被执行");
    }
}