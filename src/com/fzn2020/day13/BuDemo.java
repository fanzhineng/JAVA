package com.fzn2020.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      把sun202---放到sun202a中
 * @author: fzn
 * @create: 2020-08-06 10:01
 **/
public class BuDemo {
    public static void main(String[] args) throws IOException {
        //先把sun202数据读出来
        FileInputStream fi = new FileInputStream("F:/sun202.txt");
        //放到缓冲流中 因为是缓冲字节流所以要传入字节流
        BufferedInputStream bi = new BufferedInputStream(fi);
        //System.out.println((char)bi.read());
        //准备写 输出流
        FileOutputStream fo = new FileOutputStream("F:/sun202a.txt");
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        int c =0;
        while ((c=bi.read())!=-1){
            bo.write(c);
        }
        bo.flush();//清空bo这个缓冲流
        bi.close();
        bo.close();
    }
}
