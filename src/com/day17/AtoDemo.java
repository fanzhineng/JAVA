package com.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-12 14:24
 **/
public class AtoDemo {
    //volatile int count =0;
    AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        AtoDemo a =new AtoDemo();
        List<Thread> ti = new ArrayList<>();
        //ti增加线程
        for (int i = 0; i < 20; i++) {
            ti.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    a.ma();
                }
            }));
        }
        for (Thread ta : ti) {
            ta.start();
        }
        for (Thread b : ti) {
            b.join();
        }
        System.out.println(a.count);
    }
    public void ma(){
        for (int i = 0; i < 10000; i++) {
            //count=count+1;
            count.incrementAndGet();//增加1
        }
    }
}
