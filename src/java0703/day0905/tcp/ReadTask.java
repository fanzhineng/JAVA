package java0703.day0905.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      读取消息的任务
 * @author: fzn
 * @create: 2020-09-07 14:56
 **/
public class ReadTask implements Runnable{

    private Socket client;

    public ReadTask(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            //socket 输入流 用来读取对方的信息
            InputStream inputStream = client.getInputStream();
            //测试对象
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            Goods o = (Goods) ois.readObject();
            System.out.println("接收到商品信息："+o);

            //socket 输出流 用来向对方发信息
            OutputStream outputStream = client.getOutputStream();
            //创建字符缓冲输入流 用来读取整行数据
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            //一直读信息
            while (true){
                String s = br.readLine();
                System.out.println("接收到信息："+s);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
