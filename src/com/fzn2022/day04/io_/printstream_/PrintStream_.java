package com.fzn2022.day04.io_.printstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @program: JAVA
 * 描述：  字节打印流
 * @author: fzn
 * @create: 2022-10-17 09:49
 **/
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        // 默认输到控制台 标准输出流
        PrintStream out = System.out;
        out.println("hello");

        // 底层调用的是write()
        out.write("你好".getBytes());
        out.close();

        // 修改打印流输出的位置
        System.setOut(new PrintStream("e:\\f.txt"));
        System.out.println("和咯哦  范知能");
    }
}