package java0703.day0905.hwobject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      服务端
 * @author: fzn
 * @create: 2020-09-07 18:33
 **/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建服务器对象  指定端口号
        ServerSocket server = new ServerSocket(10086);
        //2.等待客户端连接 等待时会阻塞
        Socket client = server.accept();
        System.out.println("客户端连接成功！");
        //从服务端读取内容
        new Thread(new ReadTask(client)).start();
    }
}
