package com.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 16:29
 **/
public class Mp3Demo {
    public static void main(String[] args) throws IOException {
        String fa = "F:"+ File.separator+"时光机.mp3";
        String fb = "F:"+ File.separator+"x.txt";
        String fc = "F:"+ File.separator+"xiao.mp3";
        //mpa(fa,fb);
        mpa(fb,fc);
    }
    //读 in
    public static void mpa(String fa,String fb) throws IOException {
        //先读a文件
        FileInputStream fi = new FileInputStream(fa);
        //写到b文件
        FileOutputStream fo = new FileOutputStream(fb);
        int r= 0;
        while ((r=fi.read())!=-1){
            fo.write(r);//写
        }
    }
}
