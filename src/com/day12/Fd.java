package com.day12;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      FileInputStream
 * @author: fzn
 * @create: 2020-08-05 16:18
 **/
public class Fd {
    public static void main(String[] args) throws IOException {
        //把Java sun 写入到d盘 sun202.txt
        String str = "F:"+ File.separator+"sun202.txt";
        File f = new File(str);
        //读内容：输入字节流
        InputStream in = new FileInputStream(f);
        //读
        byte[] b = new byte[1024];
        in.read(b);//把in输入字节流读信息时，会放到b中
        in.close();
        //输出字符串
        String str2 = new String(b).trim();
        System.out.println(str2);
    }
}
