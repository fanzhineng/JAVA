package com.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 10:38
 **/
public class ByteArrDemo {
    public static void main(String[] args) throws IOException {
        String fn = "F:"+ File.separator+"sun202.txt";
        File f = new File(fn);
        byte[] bytes = getBy(f);
        String str = new String(bytes);
        System.out.println(str.trim());
    }
    //字节数组流：读内容 返回类型也是字节数组
    public static byte[] getBy(File f) throws IOException {
        FileInputStream fi = new FileInputStream(f);
        //引入缓冲流
        BufferedInputStream fin = new BufferedInputStream(fi);
        //先读出内容后，写出到 字节数组中
        //字节数组 输出
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] fl = new byte[1024];
        int le = 0;
        while ((le=fin.read(fl))!=-1) {
            bos.write(fl,0,le);
        }
        //System.out.println(fl[0]);
        return fl;
    }
    //用字节数组流写   sun202b.txt

}
