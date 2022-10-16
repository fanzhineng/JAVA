package com.fzn2022.day04.io_.outputstream_;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      文件的拷贝 复制
 * @author: fzn
 * @create: 2022-10-16 23:43
 **/
public class FileCopy {
    public static void main(String[] args) {
        // 将 e盘中的a.txt文件 拷贝到e:b.txt
        String fileName = "e:\\a.txt";
        String newFileName = "e:\\b.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            fileOutputStream = new FileOutputStream(newFileName);
            // 定义一个字节数组
            byte[] bytes = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(bytes)) !=-1){
                // 写入文件 边读编写
                fileOutputStream.write(bytes,0,readLen);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}