package java0703.day0903;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-03 10:52
 **/
public class DeadLock2 {
    public static void main(String[] args) {
        Lock left = new ReentrantLock();
        Lock right = new ReentrantLock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable leftRunnable = new Runnable() {
            @Override
            public void run() {
                left.lock();
                try {
                    System.out.println("左侧的线程执行");
                    Thread.sleep(1000);
                    System.out.println("尝试获取右边的锁");
                    if (right.tryLock(5, TimeUnit.SECONDS)) {
                        System.out.println("获取到right锁成功");
                    }else {
                        System.out.println("获取right锁失败");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    left.unlock();
                }
            }
        };
        Runnable rightRunnable = new Runnable() {
            @Override
            public void run() {
                right.lock();
                try {
                    System.out.println("右侧的线程执行");
                    Thread.sleep(1000);
                    System.out.println("尝试获取左边的锁");
                    if (left.tryLock(5, TimeUnit.SECONDS)) {
                        System.out.println("获取到left锁成功");
                    }else {
                        System.out.println("获取left锁失败");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    right.unlock();
                }
            }
        };
        executorService.submit(leftRunnable);
        executorService.submit(rightRunnable);
        executorService.shutdown();
    }
}
