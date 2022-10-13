package com.fzn2021.day05;

import java.util.Scanner;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-11 17:12
 **/
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num += num * x;
        }
        System.out.println(num);
    }
}