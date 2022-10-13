package com.fzn2020.day14;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-07 11:14
 **/
public class TDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Tr t =new Tr();
        /*
        FileOutputStream f =new FileOutputStream("F:\\a.txt");
        ObjectOutputStream ob = new ObjectOutputStream(f);
        //写
        ob.writeObject(t);
        ob.close();
       */
        //读
        FileInputStream fi = new FileInputStream("F:\\a.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        Tr tx = (Tr) oi.readObject();
        oi.close();
        System.out.println(tx.classValue);
        System.out.println(tx.id);


    }
}
class Tr implements Serializable{
    int id=10;
    transient int classValue = 101;//此值序列号时，传输不出去
}
