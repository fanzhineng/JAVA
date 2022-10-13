package com.fzn2020.java0703.day0902.waitandnotify;

/**
 * @program: JAVA
 * 描述：      wait 等待
 * @author: fzn
 * @create: 2020-09-02 16:55
 **/
public class WaitTest {
    //有两个线程打印内容
    /*
    一个线程打印数字
    一个线程打印字母
    12A34B56C....
     */
    public static void main(String[] args) {
        Object object =new Object();
        //打印数字
        new Thread("线程A"){
            @Override
            public void run() {
                for (int i = 1; i < 20; i++) {
                    synchronized (object) {
                        System.out.println(i);
                        if (i % 2 == 0) {
                            try {
                                object.notifyAll();
                                //使当前线程阻塞 使用锁对象
                                //wait 方法一定要锁对象来调 否则会抛异常
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }.start();
        //打印字母
        new Thread("线程B"){
            @Override
            public void run() {
                for (char i = 'A'; i < 'Z'; i++) {
                    synchronized (object) {
                        System.out.println(i);
                        try {
                            //唤醒其他线程
                            object.notifyAll();
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();


    }
}
