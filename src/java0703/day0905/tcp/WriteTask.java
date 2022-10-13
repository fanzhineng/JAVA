package java0703.day0905.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：     写消息的任务
 * @author: fzn
 * @create: 2020-09-07 15:06
 **/
public class WriteTask implements Runnable{
    private Socket client;

    public WriteTask(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        OutputStream os = null;
        try {
            os = client.getOutputStream();
            //os.write("你好\n".getBytes());

            //测试发送对象
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Goods goods = new Goods("薯片",5,"袋",5,"001");
            //写入对象
            oos.writeObject(goods);
            //测试结束

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String msg;
            while ((msg=br.readLine())!=null){
                // \n换行符。客户端的BufferedReader 读取\n时，则readLine会返回
                os.write((msg+"\n").getBytes());
                //清空缓冲区的内容，字符流和缓冲流会存在一个缓冲区。
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
