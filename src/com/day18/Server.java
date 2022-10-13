package com.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：      服务器
 * @author: fzn
 * @create: 2020-08-13 10:07
 **/
public class Server {
    //一个服务器
    ServerSocket serv;
    //多个客服端
    List<Socket> clis;
    public static void main(String[] args) throws IOException {
        new Server();
    }
    //构造器
    public Server() throws IOException {
        serv = new ServerSocket(8093);
        clis = new ArrayList<>();
        while (true){
            Socket so = serv.accept();//响应通信，会得到一个socket
            clis.add(so);//clis会有很多so
            MyThread t = new MyThread(so);
            t.start();//启动线程 关联多个客服端
        }
    }
    //每一个客服端要有自己的线程，可以用内部类
    class MyThread extends Thread{
        //每个线程，关联一个so
        Socket so;
        //存放信息
        String msg;
        //要看到信息 字符比较多 用缓冲流
        BufferedReader br;
        //打印流
        PrintWriter pw;
        public MyThread(Socket so){//等下传过来
            this.so = so;
        }
        //线程要做的事
        public void run(){
           //对于每个客服端来说 ，先要看到 欢迎来到聊天室 目前有多少人
            //通过地址就知道谁进来了
            msg = "欢迎━(*｀∀´*)ノ亻!"+so.getInetAddress()+"进入聊天室，目前共有"+clis.size();
            try {
                sendMsg();//进去 通知所有人
                //读信息
                br = new BufferedReader(new InputStreamReader(so.getInputStream()));
                while ((msg = br.readLine())!=null){//其他客服端说的话，也要发给别人的人
                    msg = so.getInetAddress()+"说"+msg;
                    sendMsg();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //读了之后，还要发信息
        }
        //单独取一个方法用来发信息
        public void sendMsg() throws IOException {
            //每个客服端都要发
            for (int i = 0; i < clis.size(); i++) {
                //把要发的内容指定到msg中  指定到：使用打印流
                pw = new PrintWriter(clis.get(i).getOutputStream(),true);
                pw.println(msg);//指定到msg中 自动写入\r\n 换行符
            }
            System.out.println(msg);
        }
    }

}
