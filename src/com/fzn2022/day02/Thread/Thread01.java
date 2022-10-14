package com.fzn2022.day02.Thread;

/**
 * @program: JAVA
 * 描述：  继承Thread类创建线程
 * @author: fzn
 * @create: 2022-10-13 23:30
 **/
public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        // 最终会执行的Cat的run方法
        cat.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
class Cat extends Thread {
    int time = 0;

    /**
     * 只是一个普通方法 启动线程是start调用本地的start0方法
     */
    @Override
    public void run() {
        // 重新run方法
        while (true){
            System.out.println("我是线程"+(++time)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time == 50){
                break;
            }
        }
    }
}