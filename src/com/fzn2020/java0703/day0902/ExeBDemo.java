package com.fzn2020.java0703.day0902;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：  定义3个线程 T1，T2  ,T3  保证多个线程执行的顺序  T1-T2-T3-T1-T2-T3-T1-T2-T3....每个线程输出10次
 * @author: fzn
 * @create: 2020-09-02 19:36
 **/
public class ExeBDemo {
    static Lock lock = new ReentrantLock();
    //Condition 对象 用来控制Lock锁的停止和唤醒
    static Condition condition1 = lock.newCondition();
    public static void main(String[] args) throws InterruptedException {
        new Thread("T1"){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    //加锁
                    lock.lock();
                    try {
                        System.out.println(this.getName());
                        condition1.signal();
                        //使当前线程阻塞 使用锁对象
                        //wait 方法一定要锁对象来调 否则会抛异常
                        condition1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //必须放到finally中 以确泡能够释放锁
                        //释放锁
                        lock.unlock();
                    }
                }
            }
        }.start();
        new Thread("T2"){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    //加锁
                    lock.lock();
                    try {
                        System.out.println(this.getName());
                        condition1.await();
                        condition1.signal();
                        //使当前线程阻塞 使用锁对象
                        //wait 方法一定要锁对象来调 否则会抛异常
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //必须放到finally中 以确泡能够释放锁
                        //释放锁
                        lock.unlock();
                    }
                }
            }
        }.start();
        new Thread("T3"){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    //加锁
                    lock.lock();
                    try {
                        System.out.println(this.getName());
                        condition1.signal();
                        //使当前线程阻塞 使用锁对象
                        //wait 方法一定要锁对象来调 否则会抛异常
                        condition1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //必须放到finally中 以确泡能够释放锁
                        //释放锁
                        lock.unlock();
                    }
                }
            }
        }.start();
    }
}
