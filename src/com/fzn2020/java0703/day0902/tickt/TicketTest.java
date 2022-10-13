package com.fzn2020.java0703.day0902.tickt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-02 11:40
 **/
public class TicketTest {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //创建卖票的任务
        //使用同步代码块
        TicketRunnableTask ticketRunnableTask =  new TicketRunnableTask();
        //使用同步方法的方式加锁
        TicketRunnableTask2 ticketRunnableTask2 = new TicketRunnableTask2();
        //通过Lock锁对象进行加锁
        TicketLockTask ticketLockTask = new TicketLockTask();
        //乐观锁的思想
        TicketHappyLockTask ticketHappyLockTask = new TicketHappyLockTask();
        for (int i = 0; i < 4; i++) {
            //cachedThreadPool.execute(ticketRunnableTask);
//            cachedThreadPool.execute(new TicketRunnableTask());
            //cachedThreadPool.execute(ticketRunnableTask2);
            //cachedThreadPool.execute(new TicketRunnableTask2());
            //cachedThreadPool.execute(ticketLockTask);
            //cachedThreadPool.execute(new TicketLockTask());
            cachedThreadPool.execute(ticketHappyLockTask);
        }
        //关闭
        cachedThreadPool.shutdown();
    }
}
