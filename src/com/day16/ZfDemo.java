package com.day16;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      3 新建一个类，输出zf.txt中内容
 * @author: fzn
 * @create: 2020-08-11 09:36
 **/
public class ZfDemo {
    public static void main(String[] args) throws IOException {
        red();
    }
    public static void red() throws IOException {
        //读文件
        File f = new File("E:\\思诚培训\\day30_0810\\zf.txt");
        InputStreamReader r = new InputStreamReader(new FileInputStream(f));
        BufferedReader bf = new BufferedReader(r);
        String str;
        while ((str=bf.readLine())!=null){
            System.out.println(str);
        }


    }
}
