package com.day04;

/**
 * @program: JAVA
 * 描述：
 *      新建一个类，要有子类父类
 *      实例变量，静态变量，实例方法，静态方法，各有构造器。
 *      要体现出静态控制和非静态的顺序
 * @author: fzn
 * @create: 2020-07-24 20:24
 **/
public class FaDemo {
    public static void main(String[] args) {
        Son s = new Son();
        Fa f = new Fa();

        s.Si();
        s.Sa();
    }
}
//父类
class Fa{
    int a=1;
    static int b = 2;
    static {
        System.out.println(b);
        System.out.println("我是父类中的静态代码块");
    }
    //方法
    public void f(){
        System.out.println(a);
        System.out.println("我是父类中实例方法");
    }
    public static void g(){
        System.out.println("我是父类中的静态方法");
    }
    //构造器
    public Fa(){
        System.out.println(a);
        System.out.println("我是父类中的构造器");
    }
}
//子类
class Son extends Fa{
    int c=3;
    static  int d =4;
    static {
        System.out.println(d);
        System.out.println("我是子类中的静态代码块");
    }
    //方法
    public void Si(){
        f();
        System.out.println(c);
        System.out.println("我是子类中实例方法");
        Fa.g();
    }
    public static void Sa(){
        g();
        System.out.println("我是子类中的静态方法");
    }
    //构造器
    public Son(){
        System.out.println(c);
        System.out.println("我是子类中的构造器");
    }
}
