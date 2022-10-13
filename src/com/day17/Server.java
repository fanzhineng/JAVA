package com.day17;

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
 * 描述：      服务器：
 *              通过构造器：启动服务器端，
 *               增加很多可连接的客服端clis
 *               每个线程传了clis
 *               在线程中自己的信息读 输出 还要看到其他clis的读 输出
 * @author: fzn
 * @create: 2020-08-12 16:11
 **/
//服务器
public class Server {
    //多个客服端
    List<Socket> clis;
    //有一个服务器端
    ServerSocket serv;
    public static void main(String[] args) throws IOException {
        new Server();
    }
    //默认构造器
    public Server() throws IOException {
        clis = new ArrayList<>();
        serv = new ServerSocket(8093);
        //客服端目前还没有add，等下add
        while (true){
            Socket so = serv.accept();//接收响应
            clis.add(so);
            MyThread m = new MyThread(so);
            m.start();
        }
    }
    //一个线程要关联一个客服端，内部类：调用和取属性方便
    class MyThread extends Thread{
        Socket ss;//每个线程关联到一个客服端
        BufferedReader br;
        PrintWriter pw;//通过打印流指定到某个变量和文件
        String msg;//显示信息用的
        public MyThread(Socket ss){//通过构造器传入ss
            this.ss =ss;
        }
        //线程要做的事
        @Override
        public void run() {
            //读和写
            try {
                //读客服端的信息
                br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
                msg = "welcome"+ss.getInetAddress()+"欢迎进入多人聊天室 当前共有"+clis.size()+"人";//地址
                sendMsg();
                while ((msg = br.readLine())!=null){
                    msg = ss.getInetAddress()+"说"+msg;//客服端说
                    sendMsg();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //每个客服端 还要发出信息
        public void sendMsg() throws IOException {
            System.out.println(msg);
            for (int i = 0; i < clis.size(); i++) {
                //先取出clis中的每一个客服端
                pw = new PrintWriter(clis.get(i).getOutputStream(),true);
                pw.println(msg);//写入msg中
                pw.flush();
            }
        }
    }

}
