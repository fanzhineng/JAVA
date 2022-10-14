package com.fzn2022.day02.javathread;

/**
 * @program: JavaSe1010
 * 描述：
 * @author: fzn
 * @create: 2022-10-13 20:41
 * 1】定义Runnable接口的实现类，一样要重写run()方法，这个run（）方法和Thread中的run()方法一样是线程的执行体
 *
 * 2】创建Runnable实现类的实例，并用这个实例作为Thread的target来创建Thread对象，这个Thread对象才是真正的线程对象
 *
 * 3】第三部依然是通过调用线程对象的start()方法来启动线程
 **/
public class DemoRunnable {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
    }
}

//实现Runnable接口
class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }

}