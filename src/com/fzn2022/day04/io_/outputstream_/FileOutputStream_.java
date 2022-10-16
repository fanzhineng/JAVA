package com.fzn2022.day04.io_.outputstream_;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: JAVA
 * 描述：      字节输出流
 * @author: fzn
 * @create: 2022-10-16 23:32
 **/
public class FileOutputStream_ {

    @Test
    public void writeFile() {
        String fileName = "e:\\a.txt";

        FileOutputStream fileOutputStream = null;
        try {
            // 创建方式是覆盖 写入的内容是覆盖原来的内容
            // fileOutputStream = new FileOutputStream(fileName);
            // 后面加一个true 是后面追加 不是覆盖
            fileOutputStream = new FileOutputStream(fileName,true);

            // 写入一个字节
            // fileOutputStream.write('a');
            // 写一个字符串
            String str="hello";
            // fileOutputStream.write(str.getBytes());
            // 从哪开始  写多少长度
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}