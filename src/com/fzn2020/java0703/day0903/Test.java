package com.fzn2020.java0703.day0903;

import java.util.concurrent.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-03 10:03
 **/
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        Callable<Long> callable = new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                int num =0;
                //开始时间
                long start = System.currentTimeMillis();
                while (num<100){
                    num+=10;
                    Thread.sleep(1000);
                    if (num%20==0){
                        System.out.println("兔子跑累了休息一下。。。");
                        Thread.sleep((long) (Math.random()*2000));
                    }
                }
                System.out.println("兔子到终点了~");
                long end = System.currentTimeMillis();
                return end-start;
            }
        };
        Callable<Long> callable2 = new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                int num =0;
                //开始时间
                long start = System.currentTimeMillis();
                while (num<100){
                    num+=5;
                    Thread.sleep(1000);
                }
                System.out.println("乌龟到终点了~");
                long end = System.currentTimeMillis();
                return end-start;
            }
        };
        Future<Long> submit1 = cachedThreadPool.submit(callable);
        Future<Long> submit2 = cachedThreadPool.submit(callable2);
        Long rabTime = submit1.get();
        Long wgTime = submit2.get();

        if (rabTime>wgTime){
            System.out.println("乌龟获胜 耗时："+wgTime+"兔子耗时："+rabTime);
        }else if (rabTime==wgTime){
            System.out.println("乌龟耗时："+wgTime+"兔子耗时："+rabTime+"平手");
        }
        else {
            System.out.println("兔子获胜 耗时："+rabTime+"乌龟耗时："+wgTime);
        }
    }
}
