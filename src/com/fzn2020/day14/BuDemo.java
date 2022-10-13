package com.fzn2020.day14;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-07 10:04
 **/
public class BuDemo {
    public static void main(String[] args) throws IOException {
        String fname = "F:\\a.txt";
        //写
        //wr(fname);
        //读
        rd(fname);

    }

    //缓冲字符流 BufferedWrite 缓冲字符输出流
    public static void wr(String fname) throws IOException {
        //写
        BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
        for (int i = 0; i < 6; i++) {
            bw.write("java从入门到精通");
            bw.newLine();//换行
        }
        bw.flush();//把缓冲流的数据刷新到文本中，再清除缓冲区中数据
        bw.close();//关闭流
    }
    //缓冲字符输入流 BufferedReader
    public static void rd(String fname) throws IOException {
        //读
        BufferedReader br = new BufferedReader(new FileReader(fname));
        //读
        //1.一个个读
//        char[] chars = new char[1024];
//        int read = br.read();
//        br.close();
//        String str = new String(chars,0,read);
        //2.读一行
        String str;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }

    }
}
