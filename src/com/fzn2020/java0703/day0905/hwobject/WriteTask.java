package com.fzn2020.java0703.day0905.hwobject;

import com.fzn2020.java0703.day0905.tcp.Goods;

import java.io.*;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：  写消息的操作
 * @author: fzn
 * @create: 2020-09-07 18:45
 **/
public class WriteTask implements Runnable{
    private Socket client;

    public WriteTask(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            //
            OutputStream os = client.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Goods goods = new Goods("薯片",5,"袋",5,"001");
            //写入对象
            oos.writeObject(goods);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
