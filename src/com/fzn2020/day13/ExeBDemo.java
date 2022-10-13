package com.fzn2020.day13;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *          3 控制台中，可输入，有菜单
 *  再加个目录菜单：(1注册  2登陆  3使用soso-输出代替-)
 * //User类中(id name pass)还要加 手机号(卡号 随机数生成) 先列出来，选。
 * //套餐: 1 2 3 存入序号
 * //加一字段 手机余额 默认是0，充值100---信息存入txt.
 * //用户名 密码放到后面输入，
 * @author: fzn
 * @create: 2020-08-06 18:41
 **/
public class ExeBDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------欢迎来到SoSo5G--------");
        while (true){
            System.out.println("请输入你要执行的操作 1 注册 2 登录 3 使用SoSo 4退出：");
            int nextInt = sc.nextInt();
            switch (nextInt){
                case 1:
                    reg();//注册
                    break;
                case 2:
                    //登录
                    login();
                    break;
                case 3:
                    System.out.println("使用SoSo");
                    break;
                case 4:
                    System.out.println("正在退出");
                    System.exit(0);
                default:
                    System.out.println("请按照上面的格式输入");
            }
        }

    }
    //注册 使用对象流 把注册信息写入文件中
    public static void reg() throws IOException {
        //字节输出流
        FileOutputStream fi = new FileOutputStream("F:/reg.txt");
        //对象流
        ObjectOutputStream op = new ObjectOutputStream(fi);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id:");
        int id = sc.nextInt();
        System.out.println("请输入你要注册的用户名:");
        String name = sc.next();
        System.out.println("请输入密码:");
        String pass = sc.next();
        //显示手机号码 并选择 返回手机号码
        long phone = getPhone();
        System.out.println("请输入你要充值的金额：");
        int pri = sc.nextInt();
        System.out.println("请选择你的套餐 1 2 3");
        int num = sc.nextInt();
        UserA a = new UserA(id,name,pass,phone,pri,num);
        //写入
        op.writeObject(a);
        op.close();
        System.out.println("注册成功");
        System.out.println("请记住你的信息：id:"+id+" 用户名："+name+" 密码："+pass+" 手机号码："+phone+" 余额为："+pri+" 套餐是："+num);
    }
    //随机生成手机号码
    public static long getPhone(){
        //放入map中
        Map<Integer,Long> m = new HashMap<>();
        //随机生成电话号码
        Random rd = new Random();
        for (int i = 1; i <= 6; i++) {
            long phone = rd.nextInt(100000000) + 17900000000L;
            m.put(i,phone);
        }
        System.out.println("请选择手机号码：");
        System.out.println(m);
        Scanner sc = new Scanner(System.in);
        int phone = sc.nextInt();
        for (Integer integer : m.keySet()) {
            if (phone==integer){
                return m.get(integer);
            }
        }
        if (!m.keySet().contains(phone)){
            System.out.println("请按照规定输入");
            getPhone();
        }
        return 0;
    }
    //登录 对象流登录
    public static void login() throws IOException, ClassNotFoundException {
        //字节输入流
        FileInputStream fi = new FileInputStream("F:/reg.txt");
        //对象字节输入流
        ObjectInputStream oi = new ObjectInputStream(fi);
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name =sc.next();
        System.out.println("请输入密码：");
        String pass = sc.next();
        System.out.println("请输入手机号码");
        long phone = sc.nextLong();
        UserA ua = (UserA) oi.readObject();
        if (ua.name.equals(name) && ua.pass.equals(pass) && ua.phone==phone){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败请重新登录");
            login();
        }

    }
}
//实现Serializable接口
class UserA implements Serializable {
    int id;
    String name;
    String pass;
    long phone;//手机号
    int pri;//金额
    int num;//套餐

    public UserA(int id, String name, String pass, long phone,int pri,int num) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.phone = phone;
        this.pri = pri;
        this.num = num;
    }

    @Override
    public String toString() {
        return "UserA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", phone=" + phone +
                ", pri=" + pri +
                ", num=" + num +
                '}';
    }
}
