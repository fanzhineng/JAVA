package com.fzn2022.day04.io_.inputstream_;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: JAVA
 * 描述：      文件输入流   文件写入程序中
 *      文件文件用字符流  二进制文件用字节流
 *         单个字节的读取 效率比较低
 * @author: fzn
 * @create: 2022-10-16 23:13
 **/
public class FileInputStream_ {


    /**
     * 单个字节读取 不能读取中文会乱码
     */
    @Test
    public void read01() {
        File file = new File("e:\\hello.txt");
        int readData = 0;
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream(file);
            // 返回-1 去读结束
            while ((readData = fileInputStream.read()) != -1){
                System.out.print((char) readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 关闭文件流 释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 读取字节数组 优化效率
     */
    @Test
    public void read02() {
        File file = new File("e:\\hello.txt");
        FileInputStream fileInputStream =null;
        // 一次性读取8个字节
        byte[] buf = new byte[8];
        // 实际读取个数
        int readLen = 0;
        try {
            fileInputStream = new FileInputStream(file);
            // 返回-1 去读结束
            while ((readLen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 关闭文件流 释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}