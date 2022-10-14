package com.fzn2022.day02.Thread.method;

/**
 * @program: JAVA
 * 描述：      join
 *            yield 让出线程  但是不一定礼让成功
 * @author: fzn
 * @create: 2022-10-14 07:35
 **/
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();
        for (int i = 0; i <= 20; i++) {
            Thread.sleep(10000);
            System.out.println("主线程 吃了"+i+"包子");
            if (i==5){
                System.out.println("主线程 让子线程先吃");
                // 插队  让子线程先执行
                t2.join();
                System.out.println("主线程 吃");
            }
        }
    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程 吃了"+i+"包子");
        }

    }
}