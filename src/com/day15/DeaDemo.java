package com.day15;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-10 16:45
 **/
public class DeaDemo {
    public static void main(String[] args) {
        Myx m = new Myx();
        Thread t = new Thread(m);
        t.setDaemon(true);//设置守护线程
        t.start();
    }
}
//记录日志
class Myx implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"进了A页面");
        }
    }
}
