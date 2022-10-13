package com.fzn2020.java0703.day0905.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      客户端
 * @author: fzn
 * @create: 2020-09-07 14:21
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端对象 ，指定连接服务端的ip和端口号
        //创建成功会自动连接服务端
        //localhost=127.0.0.1 本机
        Socket client = new Socket("localhost",10086);
        System.out.println("连接服务端成功！");
        //读内容线程
        new  Thread(new ReadTask(client)).start();
        //启动写消息线程
        new Thread(new WriteTask(client)).start();
    }
}
