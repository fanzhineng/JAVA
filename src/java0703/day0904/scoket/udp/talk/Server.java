package java0703.day0904.scoket.udp.talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: JAVA
 * 描述：      发送数据
 * @author: fzn
 * @create: 2020-09-07 10:31
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket 对象
        DatagramSocket socket = new DatagramSocket(10086);
        //开启写消息的线程
        new Thread((new WriteTask(socket,12306))).start();
        //创建一个线程执行读消息操作
        new Thread(new ReadTask(socket)).start();
    }
}
