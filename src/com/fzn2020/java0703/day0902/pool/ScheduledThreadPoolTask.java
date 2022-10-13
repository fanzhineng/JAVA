package com.fzn2020.java0703.day0902.pool;

import com.fzn2020.java0703.day0901.RunnableTask;

import java.security.Policy;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @program: JAVA
 * 描述：  ScheduledThreadPoolTask线程池
 * @author: fzn
 * @create: 2020-09-02 11:10
 **/
public class ScheduledThreadPoolTask {
    public static void main(String[] args) {
        //周期性任务
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
        RunnableTask runnableTask = new RunnableTask();
        //延迟执行任务 delay 指定延迟的时间  时间单位
        //pool.schedule(runnableTask,10, TimeUnit.SECONDS);

        //延迟执行周期性任务   不能关闭线程池
        //initialDelay 指定第一次执行延迟的时间
        //period 指定周期性执行的时间
        pool.scheduleAtFixedRate(runnableTask,10,2,TimeUnit.SECONDS);
        //关闭
        //pool.shutdown();
    }

}
