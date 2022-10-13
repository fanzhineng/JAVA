package com.fzn2020.day07;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-29 15:22
 **/
public class Str3Demo {
    public static void main(String[] args) {

        StringBuilder su = new StringBuilder();
        su.append("江西南昌");
        su.append("javasun");
        System.out.println(su);
        System.out.println("---------------");
        //在下标2出加u
        su.insert(2,'u');
        System.out.println(su);
        //从下标0,3 不含结束位置 删除
        su.delete(0,3);
        //替换    replace
        su.replace(2,4,"中国");
        su.reverse();//反过来
        System.out.println(su);
        System.out.println("-----------------");

        //System.out.println(test(30000));
        //System.out.println(testb(300000));//13
        //System.out.println(testc(300000));//15
    }
    //比较三种情况效率
    public static long test(int n){
        long st = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + "javasun";
        }
        long end = System.currentTimeMillis();
        return end-st;
    }
    public static long testb(int n){
        long st = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str = str.append("javasun");
        }
        long end = System.currentTimeMillis();
        return end-st;
    }
    public static long testc(int n){
        long st = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            str = str.append("javasun");
        }
        long end = System.currentTimeMillis();
        return end-st;
    }
}
