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
 * 描述：
 *  4 有余力，完成多人聊天室。
 *          服务器端：
 *                 1.创建一个服务器对象     设置端口号
 *                 2.等待多个客服端请求
 *                 3.读取客服端信息
 *                 4.服务器发出信息 通过控制台输入 然后接收发出
 *                 5.关闭io流
 * @author: fzn
 * @create: 2020-08-12 19:36
 **/
public class ExeBServerDemo {
    //创建服务器对象
    ServerSocket ser;
    //创建多个客服端 放到list里面
    List<Socket> lis;
    public static void main(String[] args) throws IOException {
        new ExeBServerDemo();
    }
    //通过默认构造器 创建服务器对象 创建多个客服端
    public ExeBServerDemo() throws IOException {
        ser = new ServerSocket(8888);
        lis = new ArrayList<>();
        //把服务器添加到list中
        while (true){
            //等待客服端响应
            Socket so = ser.accept();
            lis.add(so);
            //把客服端和线程关联起来
            MyThread m = new MyThread(so);
            m.start();//开启多线程

        }
    }
    //一个线程关联一个客服端 通过内部类进行关联
    class MyThread extends Thread{
        //每一个线程关联一个客服端
        Socket ss;
        BufferedReader br;//使用缓冲流 读取
        String msg;//显示的信息
        PrintWriter pw;//打印流 把客服端发的信息存入到msg中
        //通过默认构造器 传入ss
        public MyThread(Socket ss) {
            this.ss = ss;
        }
        //线程要做的事
        @Override
        public void run() {
            //读和写
            try {
                //通过客服端的方法读取客服端信息
                br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
                //打印出欢迎信息和进入的ip地址 共有多少人。
                msg = "welcome"+ss.getInetAddress()+"欢迎进入多人聊天室 当前共有"+lis.size()+"人";
                //打印
                System.out.println(msg);
                sendMsg();
                //读 如果不为空就继续读
                while ((msg= br.readLine())!=null){
                    msg = ss.getInetAddress()+"说"+msg;//客服端说
                    System.out.println(msg);//打印
                    sendMsg();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //每个客服端还要发信息
        public void sendMsg() throws IOException {
            //取到每个客户端
            for (int i = 0; i < lis.size(); i++) {
                //取到每个客服端的信息
                pw = new PrintWriter(lis.get(i).getOutputStream(),true);
                pw.println(msg);//放到msg中
                pw.flush();//冲流
            }
        }
    }
}
