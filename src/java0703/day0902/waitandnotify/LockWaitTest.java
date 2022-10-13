package java0703.day0902.waitandnotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：      wait 等待
 * @author: fzn
 * @create: 2020-09-02 16:55
 **/
public class LockWaitTest {
    //有两个线程打印内容
    /*
    一个线程打印数字
    一个线程打印字母
    12A34B56C....
     */
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        //Condition 对象 用来控制Lock锁的停止和唤醒
        Condition condition = lock.newCondition();
        //打印数字
        new Thread("线程A"){
            @Override
            public void run() {
                for (int i = 1; i < 20; i++) {
                    lock.lock();
                    try {
                        System.out.println(i);
                        if (i % 2 == 0) {
                            condition.signal();
                            //使当前线程阻塞 使用锁对象
                            //wait 方法一定要锁对象来调 否则会抛异常
                            condition.await();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }

                }
            }
        }.start();
        //打印字母
        new Thread("线程B"){
            @Override
            public void run() {
                for (char i = 'A'; i < 'Z'; i++) {
                    lock.lock();
                    try {
                        System.out.println(i);
                        //唤醒其他线程
                        condition.signal();
                        condition.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }

                }
            }
        }.start();


    }
}
