package com.fzn2022.day04.io_.writer_;

import com.fzn2022.day04.io_.reader_.BufferedReader_;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      文本文件的拷贝
 * @author: fzn
 * @create: 2022-10-17 00:53
 **/
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        // 将 e盘中的a.txt文件 拷贝到e:b.txt
        String fileName = "e:\\a.txt";
        String newFileName = "e:\\b.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileName));
        String readLine;
        // 读取一行是没有换行符的
        while ((readLine = bufferedReader.readLine()) !=null){
            bufferedWriter.write(readLine);
            // 插入换行符
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}