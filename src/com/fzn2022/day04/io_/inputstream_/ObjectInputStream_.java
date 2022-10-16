package com.fzn2022.day04.io_.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @program: JAVA
 * 描述：      ObjectInputStream 反序列化
 * @author: fzn
 * @create: 2022-10-17 01:29
 **/
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "e:\\a.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        // 读取的顺序需要和保存的顺序一致
        int read = objectInputStream.readInt();
        System.out.println(read);
        boolean b = objectInputStream.readBoolean();
        System.out.println(b);
        char c = objectInputStream.readChar();
        System.out.println(c);
        double v = objectInputStream.readDouble();
        System.out.println(v);
        String s = objectInputStream.readUTF();
        System.out.println(s);
        Object o = objectInputStream.readObject();
        System.out.println(o.getClass());
        System.out.println(o);
        objectInputStream.close();
    }
}