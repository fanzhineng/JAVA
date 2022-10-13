package com.fzn2020.day15;

/**
 * @program: JAVA
 * 描述：      中断程序    interrupt
 * @author: fzn
 * @create: 2020-08-10 16:10
 **/
public class InDemo {
    public static void main(String[] args) {
        MyTh m = new MyTh();
        Thread t = new Thread(m);
        t.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main睡眠");
        }
        t.interrupt();//中断
        /*
            如果15行是200 因为200比myth时间长，会等待睡眠完成
            如果是20，就不会等待其睡眠，会中断程序
         */
    }
}
class MyTh implements Runnable{

    @Override
    public void run() {
        System.out.println("进入run方法");
        try {
            Thread.sleep(100);
            System.out.println("已睡眠完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("进入异常");
            return;
        }
        System.out.println("run结束");
    }
}
