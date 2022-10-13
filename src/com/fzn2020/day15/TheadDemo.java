package com.fzn2020.day15;

/**
 * @program: JAVA
 * 描述：
 *          多线程
 *          当多个线程在运行时，cpu是默认
 * @author: fzn
 * @create: 2020-08-10 11:21
 **/
public class TheadDemo {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();//开启多线程
        ThreadB b = new ThreadB();
        b.start();
        ThreadC c = new ThreadC();
        c.start();
    }

}
class ThreadA extends Thread{
    @Override
    public void run() {//线程需要做的事
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是线程A"+i);
        }
    }
}
class ThreadB extends Thread{
    @Override
    public void run() {//线程需要做的事
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是线程B"+i);
        }
    }
}
class ThreadC extends Thread{
    @Override
    public void run() {//线程需要做的事
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是线程C"+i);
        }
    }
}