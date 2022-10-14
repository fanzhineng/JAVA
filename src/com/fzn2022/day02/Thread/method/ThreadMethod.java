package com.fzn2022.day02.Thread.method;

/**
 * @program: JAVA
 * 描述：      线程常用的方法
 * @author: fzn
 * @create: 2022-10-14 00:49
 **/
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("范");
        // 设置优先级
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        System.out.println(t.getName());

        // 主线程打印5hi 中断线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Hi"+i);
        }
        t.interrupt();
    }
}
class T extends Thread {

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+ "吃包子~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName()+ "休眠中~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                // 当该线程执行到一个 interrupt 方法时 会catch 一个异常 可以加入自己的业务代码
                // 捕获到InterruptedException 中断异常
                System.out.println(Thread.currentThread().getName()+"被 interrupt了");
            }
        }

    }
}