package com.fzn2022.day04.file_;

import org.junit.Test;

import java.io.File;

/**
 * @program: JAVA
 * 描述：      文件的创建和删除
 * @author: fzn
 * @create: 2022-10-16 14:36
 **/
public class Directory_ {

    @Test
    public void m1() {
        String filePath = "e:\\news.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void m2() {
        String filePath = "e:\\news";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("目录不存在");
        }
    }

    // 判断目录是否存在 不存在就创建
    @Test
    public void m3() {
        String filePath = "e:\\news\\aa";
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("存在");
        }else {
            // 创建
            // boolean mkdir = file.mkdir();  创建一级目录
            boolean mkdirs = file.mkdirs();
            if (mkdirs){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        }
    }
}