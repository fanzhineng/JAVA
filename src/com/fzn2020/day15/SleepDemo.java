package com.fzn2020.day15;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-10 14:54
 **/
public class SleepDemo {
    public static void main(String[] args) {
        Tha t = new Tha();
        t.start();
    }
}
class Tha extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("你很认真"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
