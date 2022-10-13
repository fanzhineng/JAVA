package com.fzn2020.day16;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-11 14:19
 **/
public class WaitDemo {
    public static void main(String[] args) {
        Object ob = new Object();
        Thread t1 = new Thread(){
          public void run(){
              //需要做的事。
              synchronized (ob){
                  System.out.println("t1 start");
                  try {
                      ob.wait();//等待锁 上锁
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("t1 end");
              }
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                //需要做的事。
                synchronized (ob){
                    System.out.println("t2 start");
                    ob.notify();//唤醒对象锁
                    System.out.println("t2 end");
                }
            }
        };
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
