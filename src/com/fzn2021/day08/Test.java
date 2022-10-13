package com.fzn2021.day08;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-16 20:32
 **/
public class Test {
    public static void main(String[] args) {
        B b = new B();
        //  a
        //  b name
        //  b
    }
}

class A {
    public A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    public B() {
        this("abc");
        System.out.println("b");
    }

    public B(String name) {
        System.out.println("b name");
    }
}


