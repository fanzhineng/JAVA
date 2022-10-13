package com.fzn2020.day17;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：      客服端
 * @author: fzn
 * @create: 2020-08-12 15:41
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket sa = new Socket("localhost",8999);
        //客服端输出
        OutputStream os = sa.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        //输出信息 得先从控制台
        Scanner sc =new Scanner(System.in);
        //接收信息 接收服务器发出的信息
        InputStream in = sa.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        String info;
        while (true){
            System.out.println("客服端说：");
            info= sc.nextLine();
            dos.writeUTF(info);
            if (info.equals("bye")){
                break;
            }
            //读信息
            info = dis.readUTF();
            System.out.println("服务器端说"+info);
        }
        //关闭流
        dis.close();
        dos.close();
        in.close();
        os.close();

    }
}
