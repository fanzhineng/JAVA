package com.fzn2020.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 *          2 新建文件，用缓冲流，完成对d盘a.txt 写入信息
 *          java从入门到精通，写6个.
 *          再用缓冲流读取信息
 * @author: fzn
 * @create: 2020-08-06 18:20
 **/
public class ExeADemo {
    public static void main(String[] args) throws IOException {
        File f = new File("F:/a.txt");
        //bw(f);
        br(f);

    }
    //缓冲流写入
    public static void bw(File f) throws IOException {
        //字节输出流
        FileOutputStream fi = new FileOutputStream(f);
        //字节缓冲流输出
        BufferedOutputStream bf = new BufferedOutputStream(fi);
        String str = "java从入门到精通";
        for (int i = 0; i < 6; i++) {
            bf.write(str.getBytes());
        }
        bf.flush();//清空
        bf.close();
    }
    //缓冲流读取
    public static void br(File f) throws IOException {
        //字节输入流
        FileInputStream fi = new FileInputStream(f);
        //缓冲字节输入流
        BufferedInputStream bi = new BufferedInputStream(fi);
        byte[] bytes = new byte[1024];
        int read = bi.read(bytes);
        bi.close();
        String str = new String(bytes,0,read);
        System.out.println(str);
    }
}
