package java0703.day0905.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：  写消息的操作
 * @author: fzn
 * @create: 2020-09-07 18:45
 **/
public class WriteTask implements Runnable{
    private Socket client;

    public WriteTask(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            //
            OutputStream os = client.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String msg;
            while ((msg=br.readLine())!=null){
                // \n换行符。客户端的BufferedReader 读取\n时，则readLine会返回
                os.write((msg+"\n").getBytes());
                if ("bye".equalsIgnoreCase(msg)){
                    System.exit(0);
                }
                //清空缓冲区的内容，字符流和缓冲流会存在一个缓冲区。
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
