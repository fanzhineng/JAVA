package com.fzn2020.day04;

/**
 * @program: JAVA
 * 描述：
 *      static
 * @author: fzn
 * @create: 2020-07-24 15:23
 **/
//运行类
public class Ko {
    public static void main(String[] args) {
        K k1 = new K();
        System.out.println(k1.i);//2
        System.out.println(k1.b);//2

        K k2 = new K();
        System.out.println(k2.i);//2
        System.out.println(k2.b);//3
        k2.getA();
    }
}

//此类中含有实例变量 和静态变量
//含有具体方法 含有static方法
class K{
    int i=1;
    static int b=1;
    static int c =1;
    public K(){
        i++;
        b++;
    }
    public void getA(){
        getB();
        //具体方法
        System.out.println("我是具体方法A");
    }
    public static void getB(){
        System.out.println("我是静态方法B");
    }
}
