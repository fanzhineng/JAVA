package com.fzn2022.javathread.selltickets;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JavaSe1010
 * 描述：      三种方式实现同步问题 卖票
 * @author: fzn
 * @create: 2022-10-13 21:03
 * 步锁:
 * 对象的同步锁只是一个概念,可以想象为在对象上标记了一个锁.
 *      1. 锁对象 可以是任意类型。
 *      2. 多个线程对象 要使用同一把锁。
 **/
public class Ticket {
    public static void main(String[] args) {
        //TicketDemo run = new TicketDemo();
        //TicketDemo1 run = new TicketDemo1();
        TicketDemo2 run = new TicketDemo2();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
    }
}

// 使用synchronized 同步代码块使用同步
class TicketDemo implements Runnable {
    private int ticket = 100;
    final Object lock = new Object();
    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {//有票 可以卖
                    //出票操作
                    //使用sleep模拟一下出票时间
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取当前线程对象的名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);
                }else if (ticket==0){
                    return;
                }
            }
        }
    }
}

// 使用synchronized同步方法  实现同步
class TicketDemo1 implements Runnable {
    private int ticket = 100;
    final Object lock = new Object();
    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            sellTicket();
        }
    }
    public synchronized void sellTicket(){
        //有票 可以卖
        if (ticket > 0) {
            //出票操作
            //使用sleep模拟一下出票时间
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //获取当前线程对象的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖:" + ticket--);
        }
    }
}
// 使用Lock锁

/**
 * public void lock() :加同步锁。
 * public void unlock() :释放同步锁。
 */
class TicketDemo2 implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();
    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            lock.lock();
            if (ticket > 0) {//有票 可以卖
                //出票操作
                //使用sleep模拟一下出票时间
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖:" + ticket--);
            }
            lock.unlock();
        }
    }
}
