package com.day16;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-11 15:48
 **/
public class VoDemo {
    //设置可见性 volatile
    volatile boolean bo = true;//设置为true
    public void ru(){
        System.out.println("ru start");
        while (bo){
            //System.out.println("ru running");
        }
        System.out.println("ru end");
    }
    public static void main(String[] args) {
        VoDemo v =new VoDemo();
        new Thread(new Runnable() {
            public void run(){
                v.ru();
            }
        }).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        v.bo=false;
    }
}
