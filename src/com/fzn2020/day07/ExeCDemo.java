package com.fzn2020.day07;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      5选做: 输入一个字符串，字符串中有大写字母
 *          小写字母 非字母。
 *           c>’A’ ...
 *          并统计各类的数量.
 * @author: fzn
 * @create: 2020-07-29 18:37
 **/
public class ExeCDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.nextLine();
        //把字符串转化为字符数组
        char[] ch = str.toCharArray();
        //计数
        int dco=0;
        int xco=0;
        int fco=0;
        //遍历
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z'){
               dco++;
            }else if (ch[i] >= 'a' && ch[i] <= 'z'){
                xco++;
            }else {
                fco++;
            }
        }
        System.out.println("大写字母："+dco+"个 小写字母："+xco+"个 非字母："+fco+"个");

    }
}
