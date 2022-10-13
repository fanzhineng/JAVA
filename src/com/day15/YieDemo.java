package com.day15;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-10 17:19
 **/
public class YieDemo {
    public static void main(String[] args) {
        Ya a = new Ya();
        Yb b = new Yb();
        Yc c = new Yc();
        a.start();
        b.start();
        c.start();
    }
}
class Ya extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            //Thread.yield();//让出
            System.out.println("A"+i);
        }
    }
}
class Yb extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            Thread.yield();//让出线程
            System.out.println("B"+i);
        }
    }
}
class Yc extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            //Thread.yield();//让出
            System.out.println("C"+i);
        }
    }
}

