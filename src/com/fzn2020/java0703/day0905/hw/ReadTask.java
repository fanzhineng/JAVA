package com.fzn2020.java0703.day0905.hw;


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
            //创建字符缓冲流 用来读取一行数据
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            //一直读
            while (true){
                String str = br.readLine();
                System.out.println("接收到的消息："+str);
                if ("bye".equalsIgnoreCase(str)){
                    System.exit(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
