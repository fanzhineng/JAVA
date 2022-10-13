package com.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      客服端
 * @author: fzn
 * @create: 2020-08-13 10:45
 **/
public class Cli {
    //客服端
    Socket so;
    //缓冲流
    BufferedReader re;
    //存放消息
    String msga;
    //打印流
    PrintWriter pw;
    public static void main(String[] args) throws IOException {
        new Cli();
    }
    //默认构造器
    public Cli() throws IOException {
        so = new Socket("192.168.190.229",8093);
        //线程启动
        new CThread().start();
        //先读信息 先读自己的 再读别人的
        BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
        while ((msga=br.readLine())!=null){
            System.out.println(msga);
        }

    }
    //每个客服端对应一个线程 线程里面进行发送消息    通过内部类
    class CThread extends Thread{
        //线程要做的事 发送消息 读取消息
        public void run() {
            //发送消息，从控制台中输入消息 放到缓冲流中
            re = new BufferedReader(new InputStreamReader(System.in));
            try {
                pw = new PrintWriter(so.getOutputStream(),true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true){
                //通过缓冲流读出来
                try {
                    msga = re.readLine();//放到msga
                    pw.println(msga);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
