package com.fzn2020.java0703.day0902.tickt;

/**
 * @program: JAVA
 * 描述：  线程安全        方法
 * 卖票任务 演示线程安全问题
 *
 * @author: fzn
 * @create: 2020-09-02 11:34
 **/
public class TicketRunnableTask2 implements Runnable{
    //全局变量
    //局部变量不存在线程安全问题 就变成了每个线程都卖50张票
    private static Integer ticketNum = 50;
    //共享的的对象
    private static Object object = new Object();
    @Override
    public void run() {
        while (ticketNum>0){
            saleTicket();
        }
        System.out.println("卖完了");

    }
    //卖票方法
    public synchronized static void saleTicket(){
        if (ticketNum>0){
            System.out.println("出票中。。。");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":卖出第"+ticketNum--+"张票");
        }
    }
}
