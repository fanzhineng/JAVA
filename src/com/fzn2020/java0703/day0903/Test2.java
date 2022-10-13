package com.fzn2020.java0703.day0903;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-03 10:25
 **/
public class Test2 {
    public static void main(String[] args) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        int[] next = {1};
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (next) {
                        try {
                            while (next[0]!=1){
                                next.wait();
                            }
                            System.out.println("T1");
                            next[0]=2;
                            //唤醒所有
                            next.notifyAll();
                            next.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (next) {
                        try {
                            while (next[0]!=2){
                                next.wait();
                            }
                            System.out.println("T2");
                            next[0]=3;
                            //唤醒所有
                            next.notifyAll();
                            //等待
                            next.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (next) {
                        try {
                            while (next[0]!=3){
                                next.wait();
                            }
                            System.out.println("T3");
                            next[0]=1;
                            //唤醒所有
                            next.notifyAll();
                            next.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        newCachedThreadPool.execute(t1);
        newCachedThreadPool.execute(t2);
        newCachedThreadPool.execute(t3);
        //关闭
        newCachedThreadPool.shutdown();
    }
}
