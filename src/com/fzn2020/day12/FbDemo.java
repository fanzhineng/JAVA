package com.fzn2020.day12;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 16:01
 **/
public class FbDemo {
    //FileNotFoundException 文件找不到异常     IOException io异常
    public static void main(String[] args) throws IOException {
        //把Java sun 写入到d盘 sun202.txt
        String str = "F:"+ File.separator+"sun202.txt";
        File f = new File(str);
        //写 ： 输出流
        //new FileOutputStream(f,)每次写会覆盖
        //new FileOutputStream(f,true)  加了true会在后面写 如果没有true会把之前的清除 再写入
        OutputStream  o= new FileOutputStream(f,true);
        String s2 = "java sun";
        //先把字符转换成字节
        byte[] b = s2.getBytes();
        o.write(b);//写入
        o.close();//关闭

    }
}