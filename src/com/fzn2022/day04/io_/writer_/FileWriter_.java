package com.fzn2022.day04.io_.writer_;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2022-10-17 00:05
 **/
public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void write01(){
        String fileName = "e:\\note.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            // 写单个字符
            // fileWriter.write('H');

            // 写入 char数组
            // char[] chars = {'a','b','c'};
            // fileWriter.write(chars);

            // 写入指定的数组的部分
            // fileWriter.write("中国共产党二十大".toCharArray(),0,3);

            // 写入字符串
            // fileWriter.write("中国共产党二十大");

            // 指定字符串的某一个部分
            fileWriter.write("中国共产党二十大",0,3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter!=null){
                // 一定要关闭 或者flush
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}