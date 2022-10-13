package com.fzn2020.java0703.day0904.scoket.udp.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @program: JAVA
 * 描述：  读的任务
 * @author: fzn
 * @create: 2020-09-07 10:53
 **/
public class ReadTask implements Runnable{
    //socket 对象
    private DatagramSocket socket;

    public ReadTask(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //2.创建数据包 指定每次读取的大小
        byte[] buff= new byte[1024];
        DatagramPacket packet = new DatagramPacket(buff,buff.length);
        //一直读取消息
        while (true){
            //读取消息
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] data = packet.getData();
            String msg = new String(data,0,packet.getLength());
            System.out.println("接收到的消息："+msg);
            //如果接受到是结束字符，则结束
            if ("bye".equalsIgnoreCase(msg)){
               System.exit(0);
            }
        }
    }
}
