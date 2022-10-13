package com.day12;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 *              4 新建一个类，分别写方法。
 *      通过字节流向x盘中 sun12.txt写内容  读内容
 *      通过字符流向向x盘中 sun12.txt写内容  读内容
 *      通过桥梁流向向x盘中 sun12.txt写内容  读内容
 * @author: fzn
 * @create: 2020-08-05 19:03
 **/
public class ExeCDemo {
    public static void main(String[] args) throws IOException {
        String str = "F:"+ File.separator+"sun12.txt";
        File f = new File(str);
        //字节流写入
        //getOutputStream(f);
        //字节流读取
        //getInputStream(f);
        //字符流写入
        //getWriter(f);
        //字符流读取
        //getReader(f);
        //桥梁流写入
        //getStreamWriter(f);
        //桥梁流读取
        getStreamReader(f);
    }
    //通过字节流向x盘中 sun12.txt写内容  读内容
    //字节流写入
    private static void getOutputStream(File f) throws IOException {
        //写：输出字节流
        OutputStream op = new FileOutputStream(f);//会覆盖
        String str2 = " java 从入门到将精通";
        //将str2转换成字节
        byte[] bytes = str2.getBytes();
        op.write(bytes);//写入
        op.close();//关闭
    }
    //字节流读取
    private static void getInputStream(File f) throws IOException {
        //读：输入字节流
        InputStream in = new FileInputStream(f);
        byte[] ch =new  byte[1024];
        int read = in.read(ch);//读取
        //关闭
        in.close();
        String str = new String(ch,0,read);
        System.out.println(str);
    }
    //通过字符流向向x盘中 sun12.txt写内容  读内容
    //写入：输出字符流
    private static void getWriter(File f) throws IOException {
        //写：输出字符流
        Writer w = new FileWriter(f);
        //写入的内容
        String str = " java 从入门到将精通2";
        //写入
        w.write(str);
        //关闭
        w.close();
    }
    //读取：输入字符流
    private static void getReader(File f) throws IOException {
        //读取：输入字符流
        Reader r = new FileReader(f);
        char[] c = new char[1024];
        int read = r.read(c);//读取
        r.close();//关闭
        String str = new String(c,0,read);//转化成字符串输出
        System.out.println(str);
    }
    //通过桥梁流向向x盘中 sun12.txt写内容  读内容
    //写：桥梁流写入
    private static void getStreamWriter(File f) throws IOException {
        //利用桥梁流写入 参数是字节输出流 接受的是字符输出流
        Writer w = new OutputStreamWriter(new FileOutputStream(f));
        String str = " java 从入门到将精通3";
        w.write(str);//写入
        w.close();//关闭
    }
    //读：桥梁流读取
    private static void getStreamReader(File f) throws IOException {
        Reader r = new InputStreamReader(new FileInputStream(f));
        char[] c = new char[1024];
        int read = r.read(c);//读取
        r.close();//关闭
        String str = new String(c,0,read);
        System.out.println(str);
    }


}
