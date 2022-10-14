package com.fzn2022.day02.Thread.tiket;

/**
 * @program: JAVA
 * 描述：  使用多线程模拟三个窗口卖票
 *      共卖100
 * @author: fzn
 * @create: 2022-10-14 00:21
 **/
public class SellTicket {
    public static void main(String[] args) {
        // 会有超卖现象
        //SellTicket01 sellTicket01 = new SellTicket01();
        //SellTicket01 sellTicket02 = new SellTicket01();
        //SellTicket01 sellTicket03 = new SellTicket01();
        //sellTicket01.start();
        //sellTicket02.start();
        //sellTicket03.start();

        // 也会有超卖问题
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();

    }
}
class SellTicket01 extends Thread {
    // 多个线程共享卖票
    private static  int num = 100;
    @Override
    public void run() {
        while (true){
            if (num < 0) {
                System.out.println("卖票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+" 售出一张票"+"剩余票数"+(--num));
        }
    }
}
class SellTicket02 extends Thread {
    // 多个线程共享卖票
    private  int num = 100;
    @Override
    public void run() {
        while (true){
            if (num < 0) {
                System.out.println("卖票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+" 售出一张票"+"剩余票数"+(--num));
        }
    }
}