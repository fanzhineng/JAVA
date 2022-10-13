package com.day17;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：      客服端：
 *               1.创建客服端对象  指定ip地址 端口号
 *               2.客服端输出 发送信息（控制台）
 *               3.客服端接收服务器发送过来的信息
 *               4.关闭流
 * @author: fzn
 * @create: 2020-08-12 18:51
 **/
public class ExeAServiceDemo {
    public static void main(String[] args) throws IOException {
        //1.创建客服端对象     指定ip地址 端口号
        Socket sa = new Socket("localhost",8889);
        //2.客服端输出 发送信息（控制台）
        OutputStream os = sa.getOutputStream();
        //使用数据流
        DataOutputStream dos = new DataOutputStream(os);
        //输出信息
        Scanner sc =new Scanner(System.in);
        // 3.客服端接收服务器发送过来的信息
        InputStream in = sa.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        //存放信息
        String info;
        while (true){
            //发送信息
            System.out.print("客服端说:");
            info = sc.nextLine();
            dos.writeUTF(info);//写入到流中 发送给服务器
            if (info.equals("bye")){
                break;//当客服端和服务端说了bye时，结束
            }
            //接收服务器发送过来的信息
            info = dis.readUTF();
            System.out.println("服务端说："+info);
            if (info.equals("bye")){
                break;
            }
        }
        os.close();
        dos.close();
        in.close();
        dis.close();
    }
}
