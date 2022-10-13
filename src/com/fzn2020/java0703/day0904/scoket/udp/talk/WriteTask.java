package com.fzn2020.java0703.day0904.scoket.udp.talk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: JAVA
 * 描述：  写的任务 发送消息
 * @author: fzn
 * @create: 2020-09-07 11:05
 **/
public class WriteTask implements Runnable{
    //1.创建DatagramSocket 对象
    private DatagramSocket socket;
    //端口号
    private int port;

    /**
     * @param socket 发送消息的对象
     * @param port 接收方的端口号
     */
    public WriteTask(DatagramSocket socket, int port) {
        this.socket = socket;
        this.port = port;
    }

    @Override
    public void run() {
        //2.获取输入的内容
        //创建一个BufferedReader 用来读取控制台输入的数据（类似于Scanner）
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            //循环读取到控制台输入的内容
            while ((str = br.readLine()) != null) {
                //创建数据包 发生消息
                DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length,
                        InetAddress.getLocalHost(), port);
                //发生数据包
                socket.send(packet);
                if ("bye".equalsIgnoreCase(str)){
                    System.exit(0);
                }
            }
        }catch (Exception e){
            System.out.println("异常");
        }
    }
}
