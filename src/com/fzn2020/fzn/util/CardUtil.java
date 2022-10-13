package com.fzn2020.fzn.util;

import java.io.*;
import java.util.HashMap;
import java.util.Random;

/**
 * @program: JAVA
 * 描述：  工具类
 * @author: fzn
 * @create: 2020-08-13 19:18
 **/
public class CardUtil {
    /**
     * getPhone()
     * 随机生成9个手机卡号
     * 使用随机数生成9个卡号，然后把他们放到map中，key>Integer value>Long
     */
    public static HashMap getPhone(){
        //把生成的手机号码放到HashMap方便取
        HashMap<Integer,Long> m = new HashMap<>();
        //创建随机对象
        Random rd = new Random();
        for (int i = 1; i < 10; i++) {
            long phone =rd.nextInt(100000000) + 13900000000L;
            m.put(i,phone);
        }
        return m;//返回map集合
    }

    /**
     * 读取文件信息
     */
    public static void showInfo(String fName) throws IOException {
        //读取文件
        File f = new File(fName);
        //使用字节流输入读取文件
        FileInputStream fi = new FileInputStream(f);
        //使用桥梁流
        InputStreamReader is = new InputStreamReader(fi);
        //再使用缓冲流读取
        BufferedReader bf = new BufferedReader(is);
        String s;
        //一次读取一行，一直读 直到没有毒到
        while ((s = bf.readLine())!=null){
            System.out.println(s);
        }
        //关闭流
        fi.close();
        is.close();
        bf.close();
    }

}
