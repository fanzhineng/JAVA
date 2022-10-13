package com.fzn2020.day15;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: JAVA
 * 描述：
 *      4 新建一个类，完成，把当前时间一分钟以内，每隔一行，按日期格式，写入到d盘中的x2.txt
 * @author: fzn
 * @create: 2020-08-10 17:53
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        ExeB b = new ExeB();
        b.start();
    }
}
class ExeB extends Thread{
    //格式化
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String fName = "F:"+ File.separator+"x2.txt";
    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
           //写入到文件中
            try {
                Writer w = new OutputStreamWriter(new FileOutputStream(fName,true));
                w.write(sf.format(new Date())+"\n");//写入 格式化
                //睡眠
                Thread.sleep(1000);
                //关闭
                w.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
