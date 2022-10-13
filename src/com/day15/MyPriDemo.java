package com.day15;

/**
 * @program: JAVA
 * 描述：      线程的优先级
 * @author: fzn
 * @create: 2020-08-10 16:54
 **/
public class MyPriDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(),"线程A");
        t1.start();
        Thread t2 = new Thread(new MyThread(),"线程B");
        t2.start();
        Thread t3 = new Thread(new MyThread(),"线程C");
        t3.start();
        //设置优先级
        t1.setPriority(Thread.MAX_PRIORITY);//值最高 总体优先
        t3.setPriority(Thread.MIN_PRIORITY);
    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            /*
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             */
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
