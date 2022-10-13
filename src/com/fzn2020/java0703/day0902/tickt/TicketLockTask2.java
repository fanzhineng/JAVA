package com.fzn2020.java0703.day0902.tickt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：  线程安全
 * 卖票任务 演示公平锁和非公平锁
 *      Lock 默认是非公平锁
 *
 * @author: fzn
 * @create: 2020-09-02 11:34
 **/
public class TicketLockTask2 implements Runnable{
    //原子类 保证原子性
    AtomicInteger atomicInteger = new AtomicInteger();
    //全局变量
    //局部变量不存在线程安全问题 就变成了每个线程都卖50张票
    //volatile 使线程对数据的修改，能够被其他线程及时感知到
    private static volatile int ticketNum = 50;
    //可重入锁
    //加了true 就是公平的
    private static Lock lock = new ReentrantLock(true);

    @Override
    public void run() {
            //加锁
            lock.lock();
            try {
                if (ticketNum>0){
                    System.out.println("出票中。。。");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":卖出第"+ticketNum--+"张票");
                }else {
                    System.out.println(Thread.currentThread().getName()+"卖完了");
                }
            } finally {
                //必须放到finally中 以确泡能够释放锁
                //释放锁
                lock.unlock();
            }
    }

    public static void main(String[] args) {
        //使用线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        TicketLockTask2 ticketLockTask2 = new TicketLockTask2();
        for (int i = 0; i < 50; i++) {
            executorService.execute(ticketLockTask2);
            //new Thread(ticketLockTask2,"线程"+i).start();
        }
    }
}
