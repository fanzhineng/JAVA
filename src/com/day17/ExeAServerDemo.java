package com.day17;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：     3 新建文件，类名要唯一，完成点对点聊天。
 *          服务器端：
 *                 1.创建服务器对象     设置端口号
 *                 2.等待客服端请求
 *                 3.读取客服端信息
 *                 4.服务器发出信息 通过控制台输入 然后接收发出
 *                 5.关闭io流
 * @author: fzn
 * @create: 2020-08-12 18:34
 **/
public class ExeAServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建服务器对象 设置端口号
        ServerSocket ser = new ServerSocket(8889);
        System.out.println("服务器启动了");
        // 2.等待客服端请求
        Socket sa = ser.accept();
        //3.读取客服端信息 调用客服端方法
        InputStream in = sa.getInputStream();
        //使用数据流，可以做到写多种类型的数据
        DataInputStream dis = new DataInputStream(in);
        //4.服务器发出信息 通过控制台输入 然后接收发出
        //调用客服端方法发出
        OutputStream os = sa.getOutputStream();
        //同样使用数据流来发出，保证做到写多种数据类型
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        //接收的信息
        String info;
        //一直读 能就行聊天
        while (true){
            info = dis.readUTF();//接收客服端传过来的信息
            System.out.println("客服端说："+info);
            if (info.equals("bye")){
                break;//如果客服端说了bye就结束聊天
            }
            //服务端发出信息给出响应
            System.out.print("服务端说：");
            info = sc.nextLine();//接收服务端输入的信息 发出
            dos.writeUTF(info);//写入数据流 让数据流输出 发送给客服端
            if (info.equals("bye")){
                break;//如果服务端说了bye就结束聊天
            }
        }
        //5.关闭io流
        in.close();
        dis.close();
        os.close();
        dos.close();
    }
}
