package com.day15;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: JAVA
 * 描述：      练习，每隔一秒把当前时间，2020-08-10- 14：20：20
 *              从现在开始，连续存1分钟，存到d盘 xx.txt
 * @author: fzn
 * @create: 2020-08-10 14:57
 */
public class Sl2Demo {
    public static void main(String[] args) {

        Exe e  = new Exe();
        Thread t = new Thread(e);
        t.start();
    }
}
class Exe implements Runnable{

    @Override
    public void run() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fName = "F:\\xx.txt";
        for (int i = 0; i < 60; i++) {
            //写内容
            try {
                Writer w = new OutputStreamWriter(new FileOutputStream(fName,true));
                w.write(sf.format(new Date())+"\r\n");//把当前时间安装sf的格式写到fName文本中
                Thread.sleep(100);
                w.close();//关闭流r
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
