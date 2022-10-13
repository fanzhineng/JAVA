package com.fzn2020.java0703.day0901.pool;

import com.fzn2020.java0703.day0901.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JAVA
 * 描述：  2)	newFixedThreadPool 定长线程池，可以自定义最大线程数量，如果并发数，超过对应的线程数量，则会排队等待线程资源。
 * @author: fzn
 * @create: 2020-09-01 11:39
 **/
public class FixedThreadPool {
    public static void main(String[] args) {
        //创建定长线程池，指定最大的线程数量
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        RunnableTask runnableTask = new RunnableTask();
        for (int i = 0; i < 5; i++) {
            fixedThreadPool.execute(runnableTask);
        }
        //关闭线程池
        fixedThreadPool.shutdown();
    }
}
