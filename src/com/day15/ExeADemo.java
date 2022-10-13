package com.day15;


import java.io.*;

/**
 * @program: JAVA
 * 描述：
 *      3 新建一个类，输出zf.txt中内容
 * @author: fzn
 * @create: 2020-08-10 17:44
 **/
public class ExeADemo {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\思诚培训\\day30_0810\\zf.txt");
        Reader r = new InputStreamReader(new FileInputStream(f));
        char[] ch = new char[1024];
        int read = r.read(ch);
        r.close();
        String str = new String(ch,0,read);
        System.out.println(str);
    }
}
