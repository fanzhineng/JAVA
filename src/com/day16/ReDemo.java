package com.day16;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: JAVA
 * 描述：      读写锁
 *
 * @author: fzn
 * @create: 2020-08-11 14:37
 **/
public class ReDemo {
    //全局变量      读写锁
    ReentrantReadWriteLock rwa = new ReentrantReadWriteLock();
    public static void main(String[] args) {
        ReDemo r = new ReDemo();
        for (int i = 0; i < 15; i++) {
            new Thread(){
                @Override
                public void run() {
                   // r.rd(this);
                    r.wr(this);
                }
            }.start();
        }
    }
    //读文件
    public void rd(Thread t){
       try {
           //不上锁
           rwa.readLock().lock();//上锁
           long st = System.currentTimeMillis();
           while (System.currentTimeMillis()-st <= 1){
               System.out.println(t.getName()+"rd正在读文件a.txt");
           }
           System.out.println(t.getName()+"rd读文件a.txt结束");

       }finally {
           rwa.readLock().unlock();//释放锁
       }
    }
    //写文件
    public void wr(Thread t){
        rwa.writeLock().lock();//上锁
        try {
            long st = System.currentTimeMillis();
            while (System.currentTimeMillis()-st <=1){
                System.out.println(t.getName()+"正在写a.txt");
            }
            System.out.println(t.getName()+"写文件a.txt结束");
        }finally {
            rwa.writeLock().unlock();//释放锁
        }
    }
}
