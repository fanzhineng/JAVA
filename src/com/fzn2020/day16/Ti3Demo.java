package com.fzn2020.day16;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-11 10:58
 **/
public class Ti3Demo {
    public static void main(String[] args) {
        Thread ta = new Tix("A");
        Thread tb = new Tix("B");
        Thread tc = new Tix("C");
        Thread td = new Tix("D");
        ta.start();
        tb.start();
        tc.start();
        td.start();
    }
}
class Tix extends Thread{
    public Tix(String name){//等下传入名字
        super(name);
    }
    public static int ti = 100;
    //在方法外面定义一个同步
    static Object ob = "a";
    @Override
    public void run(){
        while (ti>0){
            synchronized (ob){//从这行开始同步，直到代码结束
                if (ti>0){
                    System.out.println(getName()+"在卖号"+ti+"票");
                    ti--;
                }else {
                    System.out.println("票没了");
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}