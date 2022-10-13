package com.day16;

/**
 * @program: JAVA
 * 描述：
 *          新建类，有一张卡，存款有100000,有三人在三个手机取钱，通过程序控制输出实时的数据，每回取100.
 * @author: fzn
 * @create: 2020-08-11 17:40
 **/
public class ExeADemo {
    public static void main(String[] args) {
        Deposit d = new Deposit();
        Thread t1 = new Thread(d,"A");
        Thread t2 = new Thread(d,"B");
        Thread t3 = new Thread(d,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Deposit implements Runnable{
    //存款
    int i = 1000;
    @Override
    public void run() {
        while (i>0){
            synchronized (this){
                if (i>0){
                    System.out.println(Thread.currentThread().getName()+"正在取钱");
                    i-=100;//每次取100块钱
                    System.out.println("还有"+i+"元");
                }else {
                    System.out.println(Thread.currentThread().getName()+"没有钱了");
                }
            }
        }
    }
}
