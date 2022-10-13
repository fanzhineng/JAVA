package com.fzn2020.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 09:41
 **/
public class FaDemo {
    public static void main(String[] args) throws IOException {
        String fn = "F:"+ File.separator+"sun202.txt";
        File f = new File(fn);
//        wr(f);
        rd(f);
    }
    //使用桥梁流 写
    public static void wr(File f) throws IOException {
        //先用字节流接触文件
        FileOutputStream fo = new FileOutputStream(f,true);
        Writer w = new OutputStreamWriter(fo);
        w.write("oracle");
        w.close();
    }
    //读
    public static void rd(File f) throws IOException {
        FileInputStream fi = new FileInputStream(f);
        Reader r = new InputStreamReader(fi);
        //读
        char[] chars = new char[1024];
        int read = r.read(chars);
        r.close();
        String str = new String(chars,0,read);
        System.out.println(str);
    }
}
