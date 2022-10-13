package com.fzn2020.java0703.day0905.hwobject;


import com.fzn2020.java0703.day0905.tcp.Goods;

import java.io.*;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      读取消息的线程
 * @author: fzn
 * @create: 2020-09-07 18:39
 **/
public class ReadTask implements Runnable{
    private Socket client;

    public ReadTask(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            //socket输入流 用来读取消息
            InputStream inputStream = client.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            Goods o = (Goods) ois.readObject();
            System.out.println("接收到对象信息："+o);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
