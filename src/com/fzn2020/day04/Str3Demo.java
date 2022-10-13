package com.fzn2020.day04;

/**
 * @program: JAVA
 * 描述：
 *
 * @author: fzn
 * @create: 2020-07-24 15:55
 **/
public class Str3Demo {
    public static void main(String[] args) {
        Sta s = new Sta();
        System.out.println(s.i);
        System.out.println(s.a);
    }
}

//静态代码块，和非静态代码块 调用实例化变量和静态变量。
//先加载静态代码块 再加载非静态代码块
class Sta{
    int i=11;//实例化变量
    static int a =1;
    //非静态代码块
    {
        i =12;
        a =12;
        System.out.println("非静态代码块");
    }
    //静态代码块
    static {
        a =13;//先加载静态变量 再加载静态代码块。
        //i=14; 不能用 i是实例化变量，再static后面加载
        System.out.println("静态代码块");
    }
}
