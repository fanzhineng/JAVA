package com.day13;

import java.io.*;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 14:12
 **/
public class ObjDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("F:/ob.txt");
        //序列号写入
        //wrOb(f);
        //读
        rdOb(f);

    }
    //定义一个方法 把对象写入F:\ob.txt
    public static void wrOb(File f) throws IOException {
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream op = new ObjectOutputStream(fo);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册信息");
        int id = sc.nextInt();
        String name = sc.next();
        String pass = sc.next();
        User u1 = new User(id,name,pass);
        op.writeObject(u1);//把对象写入
        System.out.println("注册成功");
        op.close();
    }
    //读文件 读对象
    public static void rdOb(File f) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(fi);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出名字和密码");
        String name = sc.next();
        String pass = sc.next();
        User u = (User) oi.readObject();

        if (name.equals(u.name) && pass.equals(u.pass)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        //System.out.println(u);
        //System.out.println(u.id+" "+u.name+" "+u.pass);
    }

}
/*
    Serializable 是序列号要用的接口 此接口中没有方法，作为序列化和反序列化的
    里面有一个属性，serialversionUid用来java内存序列化的机制 就是一个id值 。
    可以是long用来设置此对象存储或传输时的唯一性和一致性。
    过程：系统默认会有一个serialversionUid
    写到序列号的文件中，用来作为此对象的唯一标记，反序列化时，用来此值和当前类的serialversionUid比较
    如果一致 说明反序列化成功。
 */
class User implements Serializable {
    int id;
    String name;
    String pass;
    public User(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
    //重写toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
