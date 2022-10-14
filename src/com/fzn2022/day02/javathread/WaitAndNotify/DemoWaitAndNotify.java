package com.fzn2022.day02.javathread.WaitAndNotify;

/**
 * @program: JavaSe1010
 * 描述： 等待唤醒案例
 *      线程之间的通信
 * @author: fzn
 * @create: 2022-10-13 21:32
 **/
public class DemoWaitAndNotify {
    public static void main(String[] args) {
        // 锁对象 保证锁唯一
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("要包子");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 之后执行的代码
                    System.out.println("开吃");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                // 花5秒中做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("做好了");
                    obj.notify();
                }
            }
        }.start();
    }
}