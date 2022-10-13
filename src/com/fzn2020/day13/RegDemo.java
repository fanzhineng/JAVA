package com.fzn2020.day13;

import java.io.*;
import java.util.Base64;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      用桥梁流完成用户注册登录
 *      F:\o2.txt
 * @author: fzn
 * @create: 2020-08-06 15:32
 **/
public class RegDemo {
    public static void main(String[] args) throws IOException {
        File f  = new File("f:/o2.txt");
        System.out.println("欢迎来到soso5g");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要进行的操作：1注册 2登录 3使用soso 4退出：");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    wr(f);
                    break;
                case 2:
                    rd(f);
                    break;
                case 3:
                    System.out.println("使用soso");
                    break;
                case 4:
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("请按照提示输入");
            }
        }
    }
    //注册 写入
    public static void wr(File f) throws IOException {
        //字节输出流
        FileOutputStream fi = new FileOutputStream(f,true);
        //使用桥梁流
        Writer ou = new OutputStreamWriter(fi);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入密码");
        String pass = sc.next();
        //写入
        ou.write(name+" "+pass+" ");
        ou.close();
        System.out.println("注册成功，请你记住用户名和密码：用户名"+name+" 密码："+pass);
    }
    //登录
    public static void rd(File f) throws IOException {
        //字节输入流
        FileInputStream fi = new FileInputStream(f);
        //使用桥梁输入流
        Reader in = new InputStreamReader(fi);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pass = sc.next();
        //读取
        char[] chars = new char[1024];
        int read = in.read(chars);
        String str = new String(chars,0,read);
        String[] strings = str.split(" ");
        boolean flag = false;
        for (int i = 0; i < strings.length; i+=2) {
            if (strings[i].equals(name)  && strings[i+1].equals(pass)){
                flag=true;
                System.out.println("登录成功");
            }
        }
        if (!flag){
            System.out.println("登录失败");
        }

        in.close();
    }
}
