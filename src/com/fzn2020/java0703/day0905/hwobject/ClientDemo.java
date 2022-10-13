package com.fzn2020.java0703.day0905.hwobject;

import java.io.IOException;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      客户端
 * @author: fzn
 * @create: 2020-09-07 18:36
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1.创建客户端对象
        Socket client = new Socket("localhost",10086);
        System.out.println("连接服务器成功！");
        //写内容发送到服务端
        new Thread(new WriteTask(client)).start();
    }
}
