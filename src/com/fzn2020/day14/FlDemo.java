package com.fzn2020.day14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 *      多个对象序列号
 * @author: fzn
 * @create: 2020-08-07 10:50
 **/
public class FlDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Flower f1 = new Flower(1,"aa",88);
        Flower f2 = new Flower(2,"bb",99);
        Flower f3 = new Flower(3,"cc",101);
        List<Flower> fs = new ArrayList<>();
        fs.add(f1);
        fs.add(f2);
        fs.add(f3);
        //读
        //ser(fs);
        //取
        fser();
    }
    //很多对象 传入集合 写入
    public static void ser(List<Flower> list) throws IOException {
        //写
        FileOutputStream fo = new FileOutputStream("F:\\bu.txt",true);
        ObjectOutputStream ob = new ObjectOutputStream(fo);
        ob.writeObject(list);//写入集合
        ob.close();//关闭
    }
    //读
    public static void fser() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("F:\\bu.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        List<Flower> li = (List<Flower>) oi.readObject();
        for (Flower f : li) {
            System.out.println(f.id+" "+f.name);
        }
        oi.close();
    }
}
class Flower implements Serializable{
    int id;
    String name;
    int pri;
    public Flower(int id,String name,int pri){
        this.id = id;
        this.name = name;
        this.pri = pri;
    }
}
