package com.fzn2020.java0703.day0902;

import java.util.concurrent.*;

/**
 * @program: JAVA
 * 描述：
 *      1、乌龟和兔子需要进行百米赛跑比赛。乌龟每秒能跑5米，兔子每秒能跑10米。
 *      但是兔子每跑20米会休息一下，时间随机。通过多线程来模拟龟兔赛跑，
 *      并最终统计乌龟和兔子的完成时间和胜利方
 * @author: fzn
 * @create: 2020-09-02 18:58
 **/
public class ExeADemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //使用线程池
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        //兔子
        Callable<Long> callable1 = new Callable(){
            @Override
            public Long call() throws Exception {
                long start = System.currentTimeMillis();
                for (int i = 0; i <= 100; i+=10) {
                    if (i!=0 && i%20==0 && i!=100){
                        System.out.println("兔子在休息");
                        Thread.sleep((long) (Math.random()*10000));
                    }else {
                        System.out.println("兔子正在跑。。。");
                        Thread.sleep(1000);
                    }
                }
                long end = System.currentTimeMillis();
                long sum = end - start;
                return sum;
            }
        };
        //乌龟
        Callable<Long> callable2 = new Callable(){
            @Override
            public Long call() throws Exception {
                long start = System.currentTimeMillis();
                for (int i = 0; i <= 100; i+=5) {
                    System.out.println("乌龟正在跑。。。");
                    Thread.sleep(1000);
                }
                long end = System.currentTimeMillis();
                long sum = end - start;
                return sum;
            }
        };
        //提交
        Future<Long> future1 = executorService1.submit(callable1);
        Future<Long> future2 = executorService2.submit(callable2);
        //得到结果
        System.out.println("兔子用的时间："+future1.get());
        System.out.println("乌龟用的时间："+future2.get());
        if (future1.get()>future2.get()){
            System.out.println("乌龟赢");
        }else {
            System.out.println("兔子赢");
        }
        //关闭
        executorService1.shutdown();
        executorService2.shutdown();
    }
}
