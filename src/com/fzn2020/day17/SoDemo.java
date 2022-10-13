package com.fzn2020.day17;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：  服务器端
 * @author: fzn
 * @create: 2020-08-12 15:27
 **/
public class SoDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ser = new ServerSocket(8999);
        Socket sa = ser.accept();//等待客服端请求
        //先读信息 通过客服端的方法调用
        InputStream in = sa.getInputStream();
        DataInputStream dis = new DataInputStream(in);//数据流
        //服务器端收到信息后，发出信息
        OutputStream os = sa.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        //要发出信息 从控制台发出
        Scanner sc = new Scanner(System.in);
        String info;//等下用于信息显示
        while (true){
            //服务器一直进行 一直开着
            //先读
            info = dis.readUTF();
            System.out.println("客服端说"+info);
            if (info.equals("bye")){
                break;
            }
            System.out.println("服务器端说：");
            info = sc.nextLine();
            dos.writeUTF(info);
        }
        //关闭流
        dis.close();
        dos.close();
        os.close();
        in.close();
    }
}
