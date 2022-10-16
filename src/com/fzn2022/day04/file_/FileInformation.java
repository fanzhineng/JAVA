package com.fzn2022.day04.file_;

import org.junit.Test;

import java.io.File;


/**
 * @program: JAVA
 * 描述：      文件的常用方法
 * @author: fzn
 * @create: 2022-10-16 14:25
 **/
public class FileInformation {
    public static void main(String[] args) {

        // 路径分隔符  Windows中是 ;  linux是:
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        // pathSeparatorChar 本系统分隔符
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);

        // 文件分隔符   Windows中是\        linux是/
        String separatorChar = File.separator;
        System.out.println(separatorChar);
    }

    // 获取文件的信息
    @Test
    public void info() {
        File file = new File("e:\\news.txt");
        // 调用文件的方法 得到对应的信息
        System.out.println("文件名="+file.getName());
        System.out.println("文件的绝对路径="+file.getAbsolutePath());
        System.out.println("文件的路径="+file.getPath());
        System.out.println("文件的父级目录="+file.getParent());
        System.out.println("文件大小="+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("是不是一个目录="+file.isDirectory());
        System.out.println("是不是一个文件="+file.isFile());
    }
}