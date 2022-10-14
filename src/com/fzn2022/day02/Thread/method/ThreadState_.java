package com.fzn2022.day02.Thread.method;

/**
 * @program: JAVA
 * 描述：  线程的多种状态
 *          官方是六种状态 但是可以细分六种
 *          NEW         新建状态
 *          RUNNABLE    运行状态 可细分
 *                  Ready 就绪状态
 *                  Running 正在运行状态
 *          BLOCKED     阻塞状态
 *          WAITING     无线等待状态
 *          TIMED_WAITING   即时等待（休眠）
 *          TERMINATED 死亡状态
 * @author: fzn
 * @create: 2022-10-14 07:55
 **/
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        System.out.println(t.getName() + " 状态 " + t.getState());
        t.start();
        while (Thread.State.TERMINATED != t.getState()) {
            System.out.println(t.getName() + " 状态 " + t.getState());
            Thread.sleep(500);
        }
        System.out.println(t.getName());
    }
}
class Test extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}