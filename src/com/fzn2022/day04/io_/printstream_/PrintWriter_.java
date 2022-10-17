package com.fzn2022.day04.io_.printstream_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: JAVA
 * 描述：      字符打印流
 * @author: fzn
 * @create: 2022-10-17 09:56
 **/
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        // PrintWriter printWriter = new PrintWriter(System.out);
        // 指定打印的位置
        PrintWriter printWriter = new PrintWriter(new FileWriter("e:\\f2.txt"));
        printWriter.println("jhi");
        printWriter.close();
    }
}