package com.fzn2020.java0703.day0901;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-01 11:40
 **/
public class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行");
    }
}
