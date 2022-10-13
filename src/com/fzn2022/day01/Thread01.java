package com.fzn2022.day01;

/**
 * @program: JavaSe1010
 * 描述：
 * @author: fzn
 * @create: 2022-10-12 13:43
 **/
public class Thread01 {
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1 ; i <= 20; i+=2) {
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =2 ; i <= 20; i+=2) {
                    System.out.println(i);
                }
            }
        }).start();

    }
}

class Cat extends Thread{
    @Override
    public void run() {
        // 重写run方法
        while (true){
            System.out.println("111");
            // 睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}