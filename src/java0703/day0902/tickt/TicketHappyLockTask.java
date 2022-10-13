package java0703.day0902.tickt;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：  线程安全
 * 卖票任务 演示线程安全问题
 *         乐观锁
 * @author: fzn
 * @create: 2020-09-02 11:34
 **/
public class TicketHappyLockTask implements Runnable{
    //全局变量
    //局部变量不存在线程安全问题 就变成了每个线程都卖50张票
    private static int ticketNum = 50;

    @Override
    public void run() {
        while (true){
            //保存原有数据
            int temp=ticketNum;
                if (ticketNum>0){
                    System.out.println("出票中。。。");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //操作数据之前是否发生变化 如果相等就执行 不等于不执行
                    if (temp==ticketNum){
                        System.out.println(Thread.currentThread().getName()+":卖出第"+ticketNum--+"张票");
                    }else{
                        System.out.println("其他线程已卖出票"+temp+"，本窗口放弃售卖");
                    }

                }else {
                    System.out.println(Thread.currentThread().getName()+"卖完了");
                    break;
                }

        }

    }
}
