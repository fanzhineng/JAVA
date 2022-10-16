package com.fzn2022.day04.io_.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: JAVA
 * 描述：  BufferedWriter的使用
 * @author: fzn
 * @create: 2022-10-17 00:49
 **/
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String fileName = "e:\\a.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write("Hello 中国");
        bufferedWriter.newLine();// 插入一个换行符
        bufferedWriter.write("Hello 中国");
        bufferedWriter.newLine();// 插入一个换行符
        bufferedWriter.write("Hello 中国");
        bufferedWriter.newLine();// 插入一个换行符
        bufferedWriter.close();
    }
}