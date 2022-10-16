package com.fzn2022.day04.file_;


import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @program: JAVA
 * 描述：      使用文件过滤器
 * @author: fzn
 * @create: 2022-10-16 16:04
 **/
public class FileFilter_ {
    public static void main(String[] args) {
        File file = new File("e:\\news");
        // getAllFile1(file);
        getAllFile2(file);
    }

    /**
     * 查找文件中的所有的.txt文件
     * @param dir
     */
    public static void getAllFile1(File dir){
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".txt");
            }
        });
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile1(file);
            }else {
                System.out.println(file);
            }
        }
    }

    /**
     * 方法二
     * @param dir
     */
    public static void getAllFile2(File dir){
        File[] files = dir.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
               return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt");
            }
        });
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile2(file);
            }else {
                System.out.println(file);
            }
        }
    }
}