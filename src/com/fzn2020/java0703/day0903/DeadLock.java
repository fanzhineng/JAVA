package com.fzn2020.java0703.day0903;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-03 10:52
 **/
public class DeadLock {
    public static void main(String[] args) {
        Object left = new Object();
        Object right = new Object();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable leftRunnable = new Runnable() {
            @Override
            public void run() {
                synchronized (left) {
                    System.out.println("左侧的线程执行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("睡眠结束");
                synchronized (right){
                    System.out.println("获取到right锁");
                }
            }
        };
        Runnable rightRunnable = new Runnable() {
            @Override
            public void run() {
                synchronized (right) {
                    System.out.println("右侧的线程执行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("睡眠结束");
                synchronized (left){
                    System.out.println("获取到left锁");
                }
            }
        };
        executorService.submit(leftRunnable);
        executorService.submit(rightRunnable);
        executorService.shutdown();
    }
}
