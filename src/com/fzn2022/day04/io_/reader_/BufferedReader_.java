package com.fzn2022.day04.io_.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: JAVA
 * 描述：  BufferedReader 的使用
 * @author: fzn
 * @create: 2022-10-17 00:44
 **/
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String fileName = "e:\\a.txt";
        // 创建
        BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
        // 读取
        String line;

        // 按行读取 当返回一个null时 读取完毕
        while ((line = bufferReader.readLine()) != null){
            System.out.println(line);
        }

        // 关闭流
        bufferReader.close();
    }
}