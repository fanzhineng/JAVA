package com.fzn2022.day04.io_.transformation;

import java.io.*;

/**
 * @program: JAVA
 * 描述：  InputStreamReader 解决中文乱码问题
 * 将字节流转换为字符流
 * @author: fzn
 * @create: 2022-10-17 09:30
 **/
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        // 读取文件
        String fileName = "e:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "GBK"));
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }
}