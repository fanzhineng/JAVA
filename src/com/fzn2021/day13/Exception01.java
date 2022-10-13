package com.fzn2021.day13;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-05 11:21
 **/
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序继续运行....");
    }
}