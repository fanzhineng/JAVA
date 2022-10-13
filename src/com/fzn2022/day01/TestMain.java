package com.fzn2022.day01;

/**
 * @program: JavaSe1010
 * 描述：
 * @author: fzn
 * @create: 2022-10-13 17:33
 **/
public class TestMain {
    public static void main(String[] args) {
        PrintNum p=new PrintNum();
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}

class PrintNum implements Runnable{
    int num=1;
    public void run() {
        while(true) {
            synchronized (this) {
                notify();
                if (num <= 20) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                } else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
