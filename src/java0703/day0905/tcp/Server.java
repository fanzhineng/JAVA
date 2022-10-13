package java0703.day0905.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：  tcp 是面向连接的通讯协议
 *      通讯方包含两部分
 *      服务端：提供连接服务
 *      客户端：连接服务端
 * @author: fzn
 * @create: 2020-09-07 14:15
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建tcp 服务端对象 ServerSocket，指定端口号
        ServerSocket server = new ServerSocket(10086);
        //2.等待客服端连接，该方法会阻塞等待，直到有客户端连接为为止
        Socket client = server.accept();
        System.out.println("有客户端连接成功！");
        //启动写消息线程
        new Thread(new WriteTask(client)).start();
        //读内容线程
        new  Thread(new ReadTask(client)).start();




        /*
        OutputStream os = client.getOutputStream();
        //os.write("你好\n".getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while ((msg=br.readLine())!=null){
            // \n换行符。客户端的BufferedReader 读取\n时，则readLine会返回
            os.write((msg+"\n").getBytes());
            //清空缓冲区的内容，字符流和缓冲流会存在一个缓冲区。
            os.flush();
        }
         */
        server.close();

    }
}
