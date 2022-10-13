package com.day15;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-10 16:33
 **/
public class In2Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("线程I" + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;//因为没有返回
                    }
                }
            }
        };
        t1.start();
        t1.interrupt();
        System.out.println("main结束");
    }
}
