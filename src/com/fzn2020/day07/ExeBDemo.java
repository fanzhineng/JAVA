package com.fzn2020.day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      4.新建一个类，输入一个字符串。要用数组下标的思路，去完成第四位增加一个元素 s,
 *      其它的后面元素向后排。输出此字符串.
 * @author: fzn
 * @create: 2020-07-29 17:44
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str = sc.next();
        //把String转换成char数组
        char[] chars = str.toCharArray();
        //空数组 存放新生成
        char[] chars1 = new char[chars.length+1];
        for (int i = 0; i < chars.length; i++) {
            if (i==3){
                //交换
                chars1[i+1] = chars[i];
                chars1[i] = 's';
            }else if (i>3){
                chars1[i+1] = chars[i];
            }else {
                chars1[i] = chars[i];
            }
        }
        System.out.println(Arrays.toString(chars1));
    }
}
