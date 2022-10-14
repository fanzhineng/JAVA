package com.fzn2022.day02.Thread;

/**
 * @program: JAVA
 * 描述： 通过实现Runnable 来实现线程
 * @author: fzn
 * @create: 2022-10-13 23:49
 **/
public class Thread02 {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        //Thread thread = new Thread(dog);
        //thread.start();
        Tiger tiger = new Tiger();
        new ThreadProxy(tiger).start();
    }
}
class Animal {

}
class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎 嗷嗷叫");
    }
}
/**
 * 底层是通过静态代理实现的线程代理类 模拟一个线程
 */
class ThreadProxy implements Runnable {

    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run(); // 动态绑定 运行类型 Tiger
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }
    public void start() {
        start0(); // 真正实现多线程的方法
    }

    private void start0() {
        run();
    }
}


class Dog implements Runnable{
    int count = 0;

    // 普通方法
    @Override
    public void run() {
        while (true){
            System.out.println("小狗 汪汪叫"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}