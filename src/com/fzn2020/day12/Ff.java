package com.fzn2020.day12;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 17:08
 **/
public class Ff {
    public static void main(String[] args) throws IOException {
        //把Java sun 写入到F盘 sun202.txt
        String str = "F:"+ File.separator+"sun202.txt";
        File f = new File(str);
        //wr(f);
        re(f);

    }
    //写：输出
    public static void wr(File f) throws IOException {
        //FileOutputStream fo = new FileOutputStream(f,true);
        //因为需要参数 参数是输出字节流
        Writer w = new OutputStreamWriter(new FileOutputStream(f,true));
        w.write(" javase");
        w.close();
    }
    //读
    public static void re(File f) throws IOException {
        //因为需要参数 参数是输出字节流
        Reader r = new InputStreamReader(new FileInputStream(f));
        char[] ch = new char[1024];
        int co = r.read(ch);
        r.close();
        String str2 = new String(ch,0,co);
        System.out.println(str2);
    }
}
