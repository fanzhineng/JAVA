package com.fzn2020.java0703.day0904.scoket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-04 11:28
 **/
public class UdpReceiver {
    public static void main(String[] args) throws IOException {
        //1.创建UDP对象
        DatagramSocket socket = new DatagramSocket(12306);
        //定义byte[]来存放数据
        byte[] buff = new byte[1024];
        //2.创建一个数据包来接收传递过来的数据包
        DatagramPacket data = new DatagramPacket(buff,buff.length);
        //3.receive方法 接收数据 数据会存入数据包 指定的数组中
        socket.receive(data);
        //获取接收到的数据长度
        int length = data.getLength();
        //获取发送的地址
        InetAddress address = data.getAddress();
        //获取接收到的数据
        byte[] data1 = data.getData();
        //将接收到内容转化成字符串
        String msg = new String(data1, 0, length);
        //获取发送者的端口号
        int port = data.getPort();
        //打印
        System.out.printf("发送者信息,ip:%s,端口号:%d,内容：%s\n",address.getHostAddress(),port,msg);
        //关闭资源
        socket.close();
    }
}
