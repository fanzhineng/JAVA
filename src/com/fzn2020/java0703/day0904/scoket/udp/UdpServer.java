package com.fzn2020.java0703.day0904.scoket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: JAVA
 * 描述：  UDP
 * @author: fzn
 * @create: 2020-09-04 11:13
 **/
public class UdpServer {
    public static void main(String[] args) throws IOException {
        //1.创建UPD对象 指定使用的端口号
        DatagramSocket socket = new DatagramSocket(10086);
        //2.创建数据包
        String str="你好，一起吃个饭？";
        //获取到字节数组
        byte[] bytes = str.getBytes();
        //getLocalHost获取本机的地址
        InetAddress address = InetAddress.getLocalHost();
        //根据ip地址
        InetAddress byName = InetAddress.getByName("192.168.188.239");
        //创建数据包，指定要传输的数据，对方的地址以及端口号
        DatagramPacket data = new DatagramPacket(bytes,bytes.length,address,12306);
        //send方法发生学消息
        socket.send(data);
        System.out.println("发生成功");
        //关闭资源
        socket.close();
    }
}
