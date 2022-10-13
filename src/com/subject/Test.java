package com.subject;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-18 15:25
 **/
public class Test {
    public static void main(String[] args) {
        B b = new B();
    }

}
class A{
    public A() {
        System.out.println("A");
    }
}
class B extends A{
    public B() {
        System.out.println("B");
    }
}
 interface a{

}
