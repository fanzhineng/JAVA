package com.fzn2022.day04.file_;

import java.io.File;

/**
 * @program: JAVA
 * 描述：      遍历目录功能
 * @author: fzn
 * @create: 2022-10-16 15:21
 **/
public class FileListFor {
    public static void main(String[] args) {
        // show1();
        show2();
    }

    /*
        public File[] listFiles()  得到所有文件
     */
    private static void show2() {
        File file = new File("F:\\思诚培训\\03JAVA\\day15_0720(javase)\\JAVA");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
        public String[] list()     遍历目录 得到String数组 会遍历隐藏的文件
           目录不存在会抛出异常
     */
    private static void show1() {
        File file = new File("F:\\思诚培训\\03JAVA\\day15_0720(javase)\\JAVA");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}