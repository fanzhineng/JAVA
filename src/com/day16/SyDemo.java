package com.day16;

import java.util.Random;

/**
 * @program: JAVA
 * 描述：          使用方法锁
 * @author: fzn
 * @create: 2020-08-11 11:33
 **/
public class SyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Ti5  t = new Ti5();
            t.start();
        }
    }

}
class Ti5 extends Thread{
    @Override
    public void run() {
        my(this);//当前线程
    }

    //当有多个线程调用此方法
    public static synchronized void my(Thread t){//整个代码成为一个整体
        Random r = new Random();
        int x = r.nextInt(10000);
        System.out.println(t.getName()+"正在选中D"+x);
        System.out.println(t.getName()+"正在为D"+x+"付款");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"已成功购D"+x);
    }
}
