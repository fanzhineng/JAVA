package com.fzn2022.day04.io_.transformation;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      转换流  字节 -> 字符
 *                      字符   -> 字节
 *
 *            看一个中文乱码问题   解决乱码问题
 * @author: fzn
 * @create: 2022-10-17 09:20
 **/
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        // 读取文件
        String fileName = "e:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        // 默认读取的是UTF-8   如果是别的编码会乱码
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }
}