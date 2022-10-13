package com.day12;

import java.io.*;

/**
 * @program: JAVA
 * 描述：  FileWriter 文件输出字符流
 * @author: fzn
 * @create: 2020-08-05 16:39
 **/
public class Fe {
    public static void main(String[] args) throws IOException {
        getFileWriter();//字符
        getFileInputStream();//字节
    }

    public static void getFileInputStream() throws IOException {
        long st = System.currentTimeMillis();
        //把Java sun 写入到F盘 sun202.txt
        String str = "F:"+ File.separator+"sun202.txt";
        File f = new File(str);
        //读内容：输入字节流
        InputStream in = new FileInputStream(f);
        //读
        byte[] b = new byte[1024];
        for (int i = 0; i < 1000000; i++) {
            in.read(b);//把in输入字节流读信息时，会放到b中
        }

//        in.close();
//        //输出字符串
//        String str2 = new String(b).trim();
//        System.out.println(str2);

        long end = System.currentTimeMillis();
        System.out.println(end-st);

    }

    public static void getFileWriter() throws IOException {
        long st = System.currentTimeMillis();
        //把Java sun 写入到d盘 sun202.txt        separator:/
        String str = "F:"+ File.separator+"sun202.txt";
        File f = new File(str);
        /*
        //写：输出字符流
        String s2 = " oracle";
        Writer w = new FileWriter(f, true);
        w.write(s2);
        w.close();
         */
        //读：输入字符流
        Reader r = new FileReader(f);
        char[] ch = new char[1024];
        for (int i = 0; i < 1000000; i++) {
            int co = r.read(ch);//读的信息放到ch中
        }

//        r.close();
        //输出字符串
        //把ch转换成字符串，按0到co的长度
//        String str2 = new String(ch,0,co);
//        System.out.println(str2);

        long end = System.currentTimeMillis();
        System.out.println(end-st);
    }
}
