package com.fzn2020.day08;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-30 09:44
 **/
public class ChDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String str = sc.next();
        /*第一种方法
        int dx=0;
        int xx=0;
        int ad=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                dx++;
            }else if (c >= 'a' && c <= 'z'){
                xx++;
            }else {
                ad++;
            }
        }
        System.out.println("大写字母："+dx+"个 小写字母："+xx+"个 非字母："+ad+"个");
         */
        //第二种方法character存入字符
        Character c1 = new Character('a');
        Character c2 = new Character((char) 97);
        System.out.println(c2);
        System.out.println("-----------------");
        //判断大写 小写 数字 其他
        int u=0,l=0,n=0,oth=0;
        char[] ch = str.toCharArray();//转化为char数组
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            //System.out.println(c);
            if (Character.isUpperCase(c)){//判断大写
                u++;
            }else if (Character.isLowerCase(c)){//判断小写
                l++;
            }else if (Character.isDigit(c)){//判断数字
                n++;
            }else {
                oth++;
            }
        }
        System.out.println("大写字母："+u+"个 小写字母："+l+"个 数字："+n+"个 其他："+oth+"个");
    }
}
