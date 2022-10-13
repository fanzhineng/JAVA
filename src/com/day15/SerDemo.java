package com.day15;

import java.io.*;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *          注册时，把通过套餐类，把其中一个属性引入，并注册
 *          登录时，只通过用户名和密码登录成功，如果登陆成功能把用户类中的
 * @author: fzn
 * @create: 2020-08-10 10:13
 **/
public class SerDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("F:"+File.separator+"ob2.txt");
        reg(f);
        //login(f);
    }
    //注册
    public static void reg(File f) throws IOException {
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream ob = new ObjectOutputStream(fo);
        System.out.println("请输入注册信息");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        String pass = sc.next();
        String ty = sc.next();//套餐信息
        User u = new User(id,name,pass);
        Comp p = new Comp();
        p.type = ty;//先把输入的type给p
        u.p = p;//把p给了User 关联起来
        ob.writeObject(u);
        System.out.println("注册成功");
        ob.close();//关闭
        System.out.println(u);

    }
    //登陆
    public static void login(File f) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oj = new ObjectInputStream(fi);
        User u = (User) oj.readObject();
        System.out.println(u.name+u.pass);
        System.out.println(u.p.type);
    }
}
//User
class User implements Serializable{
    static final long serialVersionUID = -12121212212L;
    int id;
    String name;
    String pass;
    //要用到套餐信息
    Comp p;//把他看成一个属性
    public User(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", p=" + p +
                '}';
    }
}
//套餐
class Comp implements Serializable{
    static final long serialVersionUID = -113121243554L;
    int id;
    String type;//类型
    String name;

    @Override
    public String toString() {
        return "Comp{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
