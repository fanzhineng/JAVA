package com.fzn2020.day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 11:08
 **/
public class PriDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //让系统识别打印流
        FileOutputStream fo = new FileOutputStream("F:/sun202a.txt");
        PrintStream ps = new PrintStream(fo);//传入outputStream
        if (ps!=null){
            System.setOut(ps);//让系统能识别ps为输出流
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);//把系统输出换成了ps.用了输出流
            //信息在文件中
        }

    }
}
