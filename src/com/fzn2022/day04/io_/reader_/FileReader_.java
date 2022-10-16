package com.fzn2022.day04.io_.reader_;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @program: JAVA
 * 描述：     字符流
 * @author: fzn
 * @create: 2022-10-16 23:57
 **/
public class FileReader_ {

    public static void main(String[] args) {

    }

    /**
     * 单个字符读取
     */
    @Test
    public void  read01(){
        // 创建FileReader对象
        String fileName = "e:\\a.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(fileName);
            while ((data = fileReader.read())!=-1){
                System.out.print((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字符数组
     */
    @Test
    public void  read02(){
        // 创建FileReader对象
        String fileName = "e:\\a.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] chars = new char[8];
        try {
            fileReader = new FileReader(fileName);
            while ((readLen = fileReader.read(chars))!=-1){
                System.out.print(new String(chars,0,readLen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}