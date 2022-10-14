package com.fzn2022.day02.Thread.method;

/**
 * @program: JAVA
 *             用户线程 也叫工作线程 当线程的任务执行完成或通知方式结束
 * 描述：      守护线程： 当所有的用户线程结束 守护线程自动结束
 *             常见的守护线程：垃圾回收机制
 * @author: fzn
 * @create: 2022-10-14 07:45
 **/
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        // 设置为守护线程
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i <=10 ; i++) {
            System.out.println("工作中");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("快乐聊天");
        }
    }
}