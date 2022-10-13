package com.fzn2022.day01.javathread;

/**
 * @program: JavaSe1010
 * 描述：  获取CPU处理器的几个
 * @author: fzn
 * @create: 2022-10-12 13:29
 **/
public class CupNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 可用处理器 cpu
        int cupNums = runtime.availableProcessors();
        System.out.println("当前核心处理器个数："+cupNums);
    }
}
