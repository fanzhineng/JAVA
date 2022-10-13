package com.fzn2021.day12;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-04 12:58
 **/
public class CodeBlockStatic {
    public static void main(String[] args) {
        A a = new A();// 当都为静态的时候谁在前谁先调用
    }
}

class A{
    private  int n2 = getN2();

    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码块01");
    }


    public static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }

    public int getN2(){
        System.out.println("getN2被调用...");
        return 200;
    }
}