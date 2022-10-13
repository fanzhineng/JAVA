package com.fzn2020.java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：      1.继承Thread类 重写run方法
 * @author: fzn
 * @create: 2020-08-31 14:31
 **/
public class ThreadTest extends Thread{

    //重写run方法
    @Override
    public void run() {
        System.out.println("通过继承Thread类，重写run方法创建的线程");
    }

    public static void main(String[] args) {
        //1.创建线程
        Thread thread = new ThreadTest();
        //直接调用run方法 不会开启线程 程序执行一定从上到下的
        //thread.run();
        //2.启动线程 此时java中有两个线程在执行，这两个线程需要去抢占cpu 的执行权，谁先抢到就执行谁 所以java中的多线程的执行是抢占式的
        thread.start();
        System.out.println("主线程");
        //通过匿名内部类的形式编写
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建的Thread子类重写run方法");
            }
        };
        thread1.start();
    }
}
