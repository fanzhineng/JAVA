package java0703.day0901;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @program: JAVA
 * 描述：
 *
3.假设某个银行，它可以接受顾客的汇款，每做一次汇款，便可以计算出汇款的总额。
现在有两个顾客对同一个银行账号操作，一个顾客分3次，每次将100元钱存入，
每次存入后将钱的总额输出；另外一个顾客也分3次，
每次取出100元钱，每次取出后将剩余的钱的总额输出。
编写一个程序模拟实际的操作过程
 * @author: fzn
 * @create: 2020-09-01 17:20
 **/
public class ExeCDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //使用线程池创建线程
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //存钱
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    bank.add();
                    Thread.yield();
                }
            }
        };
        //取钱
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    if (bank.sum<=0){
                        i--;
                    }else {
                        bank.sub();//取钱
                    }
                    Thread.yield();
                }
            }
        };
        //提交给线程池
        executorService.submit(runnable1);
        executorService.submit(runnable2);
        //关闭
        executorService.shutdown();
    }
}
//银行类
class Bank{
    int sum=0;
    //存钱
    public synchronized  void add(){
        sum +=100;
        System.out.println("存钱+100，当前可用余额："+sum);
    }
    //取钱
    public synchronized void sub(){
        sum -=100;
        System.out.println("取钱-100，当前可用余额："+sum);
    }
}