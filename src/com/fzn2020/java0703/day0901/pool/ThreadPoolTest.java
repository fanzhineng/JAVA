package com.fzn2020.java0703.day0901.pool;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: JAVA
 * 描述：         利用线程池创建线程
 * @author: fzn
 * @create: 2020-09-01 10:42
 **/
public class ThreadPoolTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行");
            }
        };
        //执行对应的任务，传入Runnable任务,线程池会开辟一个线程来执行该任务
        for (int i = 0; i < 10; i++) {
            executorService.execute(runnable);
        }
        Callable<Integer> callable = new Callable<Integer>(){

            @Override
            public Integer call() throws Exception {
                int count =0;
                for (int i = 1; i <= 10; i++) {
                    count+=i;
                }
                return count;
            }
        };
        //submit 提交线程到线程池中  返回future对象 可以通过该对象获取线程返回结果
        Future<Integer> submit = executorService.submit(callable);
        Integer result = submit.get();//得到结果
        System.out.println("result:"+result);
        //批量传入多个任务，并执行
        //callable 任务集合
        List<Callable<Integer>> list = Arrays.asList(callable,callable,callable);
        //有返回值
        List<Future<Integer>> futures = executorService.invokeAll(list);
        for (Future<Integer> future : futures) {
            Integer integer = future.get();
            System.out.println(integer);
        }
        //关闭线程池
        executorService.shutdown();
    }
}
