package com.fzn2022.javathread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: JavaSe1010
 * 描述：   使用Callable 创建线程池
 * @author: fzn
 * @create: 2022-10-13 22:11
 **/
public class DemoCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<Integer>(new MyCallable());

        Thread thread = new Thread(task);

        thread.start();

        System.out.println(task.get());
    }
}

class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+",正在执行!");
        int sum = 0;
        for(int i = 0 ; i <=100 ; i++){
            sum+=i;
        }
        return sum;
    }
}