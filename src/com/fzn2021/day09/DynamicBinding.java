package com.fzn2021.day09;

/**
 * @program: JavaSE
 * 描述：    动态绑定机制
 * @author: fzn
 * @create: 2021-12-20 17:04
 **/
public class DynamicBinding {
    public static void main(String[] args) {
        String s = new String();
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
        // 如果把A的sum方法注释掉 是什么情况呢

    }
}

// 父类
class A{
    public int i = 10;
    public int sum(){
        return getI() +10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A {
    public int i = 20;
    public int sum(){
        return i +20;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}