package com.fzn2020.java0703.day0901.pool;

import com.fzn2020.java0703.day0901.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JAVA
 * 描述：  3)	newSingThreadPool：单个线程池。只会创建一个线程来执行所有的任务
 * @author: fzn
 * @create: 2020-09-01 11:49
 **/
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        RunnableTask runnableTask = new RunnableTask();
        for (int i = 0; i < 10; i++) {
            executorService.execute(runnableTask);
        }
        executorService.shutdown();
    }
}
