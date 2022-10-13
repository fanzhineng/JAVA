package com.fzn2020.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：      多人聊天室 客服端
 * 客服端：
 *  *               1.创建客服端对象  指定ip地址 端口号
 *  *               2.客服端输出 发送信息（控制台）
 *  *               3.客服端接收服务器发送过来的信息
 *  *               4.关闭流
 * @author: fzn
 * @create: 2020-08-12 19:59
 **/
public class ExeBServiceDemo {
    //创建客服端
    Socket so;
    public static void main(String[] args) throws IOException {
        new ExeBServiceDemo();
    }
    //通过默认构造器 创建客服端对象
    public ExeBServiceDemo() throws IOException {
        so = new Socket("192.168.188.169",8999);
        //启动        输出
        new CThread().start();
        //读取 先读自己的 再读别人的
        BufferedReader bf = new BufferedReader(new InputStreamReader(so.getInputStream()));
        String msg;
        while ((msg=bf.readLine())!=null){
            System.out.println(msg);
        }

    }
    class CThread extends Thread{
        @Override
        public void run() {
            //打印流
            try {
                PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
                //读 把控制台输入的读取出来
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                String msg;
                while (true){
                    msg = bf.readLine();
                    pw.println(msg);//指定输出到msg中
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
