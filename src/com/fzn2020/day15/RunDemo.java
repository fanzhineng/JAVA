package com.fzn2020.day15;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-10 11:32
 **/
public class RunDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());

        RunA a = new RunA();//线程体
        Thread  ta = new Thread(a);//转化成线程
        ta.start();

        RunB b = new RunB();
        Thread  tb = new Thread(b);//转化成线程
        tb.start();

        new Thread(new RunC()).start();//链式编程 线程c

    }
}
//实现Runnable
class RunA implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getId());//当前线程的id
            System.out.println(Thread.currentThread().getName());
            System.out.println("线程A"+i);
        }
    }
}
class RunB implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getId());//当前线程的id
            System.out.println(Thread.currentThread().getName());
            System.out.println("线程B"+i);
        }
    }
}
class RunC implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程C"+i);
        }
    }
}
