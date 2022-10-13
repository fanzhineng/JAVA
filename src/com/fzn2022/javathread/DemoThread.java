package com.fzn2022.javathread;

/**
 * @program: JavaSe1010
 * 描述：  创建线程的四种方式
 *              基础Thread
 *              实现Runnable接口
 *              使用Callable和Future创建线程
 *              线程池创建
 * @author: fzn
 * @create: 2022-10-13 20:37
 *
 * 1】定义Thread类的子类，并重写该类的run()方法，该方法的方法体就是线程需要完成的任务，run()方法也称为线程执行体。
 *
 * 2】创建Thread子类的实例，也就是创建了线程对象
 *
 * 3】启动线程，即调用线程的start()方法
 **/
public class DemoThread {
    public static void main(String[] args) {
        // 随机性打印结果
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
    }
}

//继承Thread类
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }
}