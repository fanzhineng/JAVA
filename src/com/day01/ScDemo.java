package com.day01;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      三元运算符
 * @author: fzn
 * @create: 2020-07-20 11:00
 **/
public class ScDemo {
    public static void main(String[] args) {
        //创建输入设置类对象
        Scanner sc = new Scanner(System.in);
        //输入整数 int类型
        //int i=sc.nextInt();
        String str = sc.next();
        System.out.println("你刚才输入的值为："+str);

        //三元运算符
        System.out.println("请输入总记录数和每页显示的条数");
        //总条数
        int s = sc.nextInt();
        //条数
        int p = sc.nextInt();
        int page = s%p==0 ?(s/p):(s/p)+1;
        System.out.println("需要分的页数："+page);
    }
}
