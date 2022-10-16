package com.fzn2022.day04.io_.outputstream_;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2022-10-17 01:06
 **/
public class BufferedCopy2 {
    public static void main(String[] args) throws IOException {
        String fileName = "e:\\a.txt";
        String newFileName = "e:\\b.txt";

        // 创建对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFileName));
        // 读
        byte[] bytes = new byte[1024];
        // 实际读取的长度
        int readLen = 0;
        while (( readLen= bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,readLen);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}