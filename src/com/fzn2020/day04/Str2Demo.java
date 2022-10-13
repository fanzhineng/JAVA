package com.fzn2020.day04;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-24 15:47
 **/
public class Str2Demo extends Ba{
    /*
    public    void test(){//编译出错，不能重写符父类的静态方法

    }*/
    public static void main(String[] args) {

    }
}
class Ba{
    public static void test(){
        System.out.println("我是Ba中的静态方法");
    }
}
