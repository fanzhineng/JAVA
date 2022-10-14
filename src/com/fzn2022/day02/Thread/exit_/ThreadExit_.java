package com.fzn2022.day02.Thread.exit_;

/**
 * @program: JAVA
 * 描述：线程终止  通知线程退出
 * @author: fzn
 * @create: 2022-10-14 00:40
 **/
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        // 如果希望主线程去控制t1 线程的终止 必须修改loop
        // 让t1退出run方法 从而终止 t1线程 -> 通知方式
        Thread.sleep(1000*10);
        t.setFlag(false);
    }
}
class T extends Thread {

    private boolean flag = true;
    int count = 0;

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中"+ (++count));
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}