package com.fzn2022.day04.io_.standard;

import java.io.PrintStream;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2022-10-17 09:15
 **/
public class InputAndOutput {
    public static void main(String[] args) {
        // public final static InputStream in = null; 编译类型 InputStream
        // BufferedInputStream 运行类型
        // System.in 标准输入
        System.out.println(System.in.getClass());


        // System.out 标准输出 显示器
        // PrintStream 编译类型
        // PrintStream 运行类型
        System.out.println(System.out.getClass());
    }
}