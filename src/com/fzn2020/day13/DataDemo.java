package com.fzn2020.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 11:31
 **/
public class DataDemo {
    public static void main(String[] args) throws IOException {
        dataFile();

    }
    //通过数据流对文件写和读
    public static void dataFile() throws IOException {
        FileOutputStream fo =new FileOutputStream("F:/sun203.txt");
        DataOutputStream dos = new DataOutputStream(fo);
        dos.writeChar(97);
        dos.writeLong(132);
        dos.writeUTF("中");
        //取
        FileInputStream fi = new FileInputStream("F:/sun203.txt");
        DataInputStream dis = new DataInputStream(fi);
        System.out.println(dis.readChar());
        System.out.println(dis.readLong());
        System.out.println(dis.readUTF());

    }
}
