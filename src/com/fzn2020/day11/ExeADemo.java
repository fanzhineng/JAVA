package com.fzn2020.day11;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 *          2 新建一个类，用linkedHashMap，完成控制台，注册和登陆，
 *  用户信息，(用户名 密码 手机号.) 都要核对才算登陆成功.
 * @author: fzn
 * @create: 2020-08-04 18:22
 **/
public class ExeADemo {
    LinkedHashMap<Integer,User> m = new LinkedHashMap<>();
    public static void main(String[] args) {
        System.out.println("欢迎来到登录，注册页面：");
        Scanner sc = new Scanner(System.in);
        ExeADemo e = new ExeADemo();//创建对象
        while (true){
            System.out.print("请输入你要进行的操作 1.注册2.登录：3.退出");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    e.reg();//注册
                    break;
                case 2:
                    e.login();//登录
                    break;
                case 3:
                    System.out.println("退出");
                   System.exit(0);
                default:
                    System.out.println("请按操作输入");
            }
        }
    }
    //reg
    public void reg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pass = sc.next();
        //手机号 随机生成
        Random rd = new Random();
        int phone = rd.nextInt(900)+10000000;
        System.out.println("请记住卡号 用户名 密码");
        System.out.println("卡号："+phone+" 用户名："+name+" 密码："+pass);
        User u = new User(name,pass,phone);
        m.put(1,u);//把信息存入
        System.out.println("注册成功");
    }
    //login
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入卡号:");
        int phone = sc.nextInt();
        System.out.println("请输入用户名:");
        String name = sc.next();
        System.out.println("请输入密码");
        String pass = sc.next();
        User u =new User(name,pass,phone);
        boolean c =false;//如果c是true标记登录成功
        if (m.containsValue(u)){
            System.out.println("登录成功");
            c = true;
        }else {
            System.out.println("登录失败,请重新登录");
            login();
        }
    }
}
class User{
    String name;
    String pass;
    int phone;
    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
    public User(String name, String pass, int phone) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
    }
    //重写
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        User u = (User) obj;
        return this.name.equals(u.name) && this.pass.equals(u.pass) && this.phone==u.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", phone=" + phone +
                '}';
    }

}
