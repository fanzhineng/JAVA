package com.day04;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-24 15:10
 **/
public class StDemo {
    //内部类
    static class InClass{
        int a=1;
        public InClass(){
            System.out.println("我是InClass");
        }
    }
    static void ta(){
        System.out.println("我是静态方法");
    }
    public static void main(String[] args) {
        //测试内部类
       // StDemo s = new StDemo();
        //System.out.println(s.new InClass());
       // System.out.println(s.new InClass().a);

        //static 数据是放再静态池中
        InClass in = new StDemo.InClass();
        System.out.println(in.a);
        System.out.println("-------");
        StDemo.ta();
    }
}
