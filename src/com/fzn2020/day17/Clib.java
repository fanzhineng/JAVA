package com.fzn2020.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @program: JAVA
 * 描述：          客服端
 * @author: fzn
 * @create: 2020-08-12 17:11
 **/
public class Clib {
    Socket so;//客服端
    public static void main(String[] args) throws IOException {
        new Clib();
    }
    //默认构造器
    public Clib() throws IOException {
        so = new Socket("192.168.188.229",8093);//连接服务端
        new Cthread().start();//启动
        // 先读自己的，再读别人的。
        BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
        String msga;
        while ((msga =br.readLine())!=null){
            System.out.println(msga);
        }

    }
    class Cthread extends Thread{
        @Override
        public void run() {
            //打印流
            try {
                //客服端输出信息
                PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
                //读     把控制台输入的输出来
                BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
                String msg2;
                while (true){
                    msg2 = re.readLine();
                    pw.println(msg2);//输出指定到msg2中
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
