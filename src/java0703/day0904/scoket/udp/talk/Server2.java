package java0703.day0904.scoket.udp.talk;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * @program: JAVA
 * 描述：      接收数据包
 * @author: fzn
 * @create: 2020-09-07 10:44
 **/
public class Server2 {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket(12306);
        //创建一个线程执行读消息操作
        new Thread(new ReadTask(socket)).start();
        //创建一个线程执行写消息操作
        new Thread(new WriteTask(socket,10086)).start();
    }
}
