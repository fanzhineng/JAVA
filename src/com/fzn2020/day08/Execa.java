package com.fzn2020.day08;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      输入匹配异常，InputMismatchException
 *      比如   在Scanner中输入数，结果输入字符，格式不对。
 *
 * @author: fzn
 * @create: 2020-07-30 15:26
 **/
public class Execa {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println("你刚输入的值为"+i);
        }catch (Exception e){
            e.getMessage();
            System.out.println("输入格式异常，请输入整数");
        }finally {
            System.out.println("finally");
        }

    }
}
