package com.day20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JAVA
 * 描述：      1)	newCachedThreadPool 可缓冲的线程池
 * @author: fzn
 * @create: 2020-08-20 10:14
 **/
public class ExeDemo {
    public static void main(String[] args) {

        //创建6个线程
        //ExecutorService 线程池的类 
        ExecutorService ex = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 6; i++) {
            //提交线程到线程池中
            ex.submit(new Runnable() {
                @Override
                public void run() {
                    //当前线程的名字
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        //有序关闭
        ex.shutdown();
    }
}
