package com.fzn2020.day16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：      独占锁
 * @author: fzn
 * @create: 2020-08-11 15:28
 **/
public class Ren2Demo {
    static Lock lo = new ReentrantLock();//独占锁
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new  Thread(){
                @Override
                public void run() {
                    rdf("a.txt");
                }
            }.start();
        }
    }
    //读为例
    public static void rdf(String fName){
        try {
            lo.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"正在读a.txt");
            }
            System.out.println(Thread.currentThread().getName()+"读完了a.txt");
        }finally {
            lo.unlock();
        }
    }
}
