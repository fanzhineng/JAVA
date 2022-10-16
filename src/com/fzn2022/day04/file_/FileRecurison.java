package com.fzn2022.day04.file_;

import java.io.File;

/**
 * @program: JAVA
 * 描述：      递归打印多级目录
 * @author: fzn
 * @create: 2022-10-16 15:40
 **/
public class FileRecurison {
    public static void main(String[] args) {
        File file = new File("e:\\news");
        // getAllFile(file);
        getOneFile(file);
    }

    /**
     * 查找文件中的所有的文件和文件夹
     * @param dir
     */
    public static void getAllFile(File dir){
        // 遍历的吗，目录
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }

    /**
     * 找到指定的文件夹
     * @param dir
     */
    public static void getOneFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getOneFile(file);
            }else {
                String s = file.toString();
                boolean b = s.toLowerCase().endsWith(".txt");
                if (b) {
                    System.out.println(file);
                }
            }
        }
    }
}