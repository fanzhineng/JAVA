package com.fzn2020.day16;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-11 16:30
 **/
public class Vo2Demo {
    volatile int count =0;//如果是10000就保证了原子性
    public static void main(String[] args) throws InterruptedException {
        Vo2Demo v = new Vo2Demo();
        List<Thread> tb = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tb.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    v.ma();
                }
            }));
        }
        //启动
        for (Thread t : tb) {//集合中的线程启动
            t.start();
        }
        for (Thread a : tb) {
            a.join();
        }
        System.out.println(v.count);
    }

    public  void ma(){
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }
}
