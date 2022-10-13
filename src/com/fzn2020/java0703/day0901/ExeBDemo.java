package com.fzn2020.java0703.day0901;

import java.util.concurrent.*;

/**
 * @program: JAVA
 * 描述：
 *          2.通过线程池处理1~300的和，通过三个线程来完成。
 * @author: fzn
 * @create: 2020-09-01 16:55
 **/
public class ExeBDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //使用线程池
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        Callable<Integer> callable1 = new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                int sum =0;
                for (int i = 1; i <= 100; i++) {
                    sum +=i;
                }
                return sum;
            }
        };
        Callable<Integer> callable2 = new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                int sum =0;
                for (int i = 101; i <= 200; i++) {
                    sum +=i;
                }
                return sum;
            }
        };
        Callable<Integer> callable3 = new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                int sum =0;
                for (int i = 201; i < 301; i++) {
                    sum +=i;
                }
                return sum;
            }
        };
        //提交到线程池中
        Future<Integer> future1 = fixedThreadPool.submit(callable1);
        Future<Integer> future2 = fixedThreadPool.submit(callable2);
        Future<Integer> future3 = fixedThreadPool.submit(callable3);
        //得到结果
        Integer integer1 = future1.get();
        Integer integer2 = future2.get();
        Integer integer3 = future3.get();
        System.out.println("1~100的和："+integer1);
        System.out.println("101~200的和："+integer2);
        System.out.println("201~300的和："+integer3);
        System.out.println("1~300的和："+(integer1+integer2+integer3));
        //关闭线程池
        fixedThreadPool.shutdown();
    }
}
