package com.day16;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-11 10:49
 **/
public class Ti2Demo {
    public static void main(String[] args) {
        MyTi m = new MyTi();
        Thread t1 = new Thread(m,"A");
        Thread t2 = new Thread(m,"B");
        Thread t3 = new Thread(m,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyTi implements Runnable{
    int ti =10;//默认十张票
    @Override
    public synchronized void run() {
        while (ti>0){
            try {
                Thread.sleep(1000);
                ti--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"还剩下"+ti+"张票");
        }
    }
}
