package com.day14;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @program: JAVA
 * 描述：      字节数组流
 * @author: fzn
 * @create: 2020-08-07 10:26
 **/
public class ByDemo {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        bo.write(a);
        bo.write(b);
        bo.write(c);
        bo.write(d);
        byte[] bytes = bo.toByteArray();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("------------");
        //读数组中的信息
        ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
        int k =0;
        while ((k=bi.read())!=-1){
            System.out.println(k);
        }
    }
}
