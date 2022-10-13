package com.fzn2022.javathread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JavaSe1010
 * 描述：  线程池
 * @author: fzn
 * @create: 2022-10-13 22:00
 **/
public class DemoExecutor {
    public static void main(String[] args) {
        // 创建线程池对象  可重用固定性线程池  第二选项
        //ExecutorService service = Executors.newFixedThreadPool(2);//包含2个线程对象

        // 缓存型 线程池  首选
        ExecutorService service = Executors.newCachedThreadPool();
        // 调度型线程池
        //ExecutorService service = Executors.newScheduledThreadPool(2);

        // 单例线程
        //ExecutorService service = Executors.newSingleThreadExecutor();
        // 创建Runnable实例对象
        MyRunnable r = new MyRunnable();

        //自己创建线程对象的方式
        // Thread t = new Thread(r);
        // t.start(); ‐‐‐> 调用MyRunnable中的run()

        // 从线程池中获取线程对象,然后调用MyRunnable中的run()
        service.submit(r);
        // 再获取个线程对象，调用MyRunnable中的run()
        service.submit(r);
        service.submit(r);

        // 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
        // 将使用完的线程又归还到了线程池中
        // 关闭线程池
        //service.shutdown();

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了： " + Thread.currentThread().getName());
        System.out.println("教我游泳,交完后，教练回到了游泳池");
    }
}
