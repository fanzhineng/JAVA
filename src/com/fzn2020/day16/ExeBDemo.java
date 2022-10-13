package com.fzn2020.day16;


import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JAVA
 * 描述：      3 通过独占锁 ReentrantLock
 *   来完成三个线程对d盘中zf.txt内容的读取.
 * @author: fzn
 * @create: 2020-08-11 18:31
 **/
public class ExeBDemo {
    //声明全局的独占锁
    static Lock l = new ReentrantLock();
    public static void main(String[] args){
        File f = new File("E:\\思诚培训\\day30_0810\\zf.txt");
       //完成三个线程对d盘中zf.txt内容的读取.
        for (int i = 0; i < 3; i++) {
            //匿名线程 开启线程
            new Thread(){
                @Override
                public void run() {
                    try {
                        rw(f);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
    //读取内容
    public static void rw(File f) throws IOException {
        //使用独占锁
        try {
            l.lock();
            //读
            InputStreamReader r = new InputStreamReader(new FileInputStream(f));
            BufferedReader bf = new BufferedReader(r);
            String str;
            while ((str=bf.readLine())!=null){
                System.out.println(str);
            }
        } finally {
            l.unlock();
        }

    }

}
