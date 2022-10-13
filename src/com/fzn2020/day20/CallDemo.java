package com.fzn2020.day20;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: JAVA
 * 描述：
 *          创建线程的四种方式：
 *              1）继承Thread类创建线程
 *              2）实现Runnable接口创建线程
 *              3）使用Callable和Future创建线程
 *              4）使用线程池例如用Executor框架
 * @author: fzn
 * @create: 2020-08-20 09:56
 **/
//Callable是一个接口 要实现call方法 有返回类型，默认是object类型
//通过泛型可以把类型改掉Callable<String>
public class CallDemo implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return "ok";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> call = new CallDemo();//先得到callDemo对象
        //包装，包装后，是一个Runnable类型
        FutureTask<String> fu = new FutureTask<>(call);
        //再放到Thread里面
        Thread t = new Thread(fu);
        t.start();//线程启动了
        System.out.println(fu.get());//得到返回类型
    }
}
