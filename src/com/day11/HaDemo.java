package com.day11;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 10:28
 **/
public class HaDemo {
    Map<Integer,Part> map = new LinkedHashMap<>();//全局变量
    public static void main(String[] args) {
        //HashMap<Integer,String> ha = new HashMap<>();
        HaDemo h =new  HaDemo();
        while (true){
            System.out.println("欢迎来到5gsoso.1注册2登陆3使用4退出");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i){
                case 1:
                    h.reg();
                    break;
                case 2:
                    h.login();
                    break;
                case 3:
                    h.wel();
                    break;
                case 4:
                    h.exit();
                    break;
                default:
                    System.out.println("请按照提示进行。");
            }
        }
    }
    //1 reg
    public void reg(){
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入密码");
        String pass = sc.next();
        Random rd = new Random();
        int cid = rd.nextInt(900)+100;//保证三位数
        Part p =new Part(name,pass,cid);
        System.out.println("请记住卡号 用户名 密码");
        System.out.println(cid+" "+name+" "+pass);
        //把信息存入map<cid,Part>
        map.put(cid,p);
        System.out.println("注册成功");
    }
    //2 login
    public void login(){
        System.out.println("请输入用户名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入密码");
        String pass = sc.next();
        Part p =new Part(name,pass);
        boolean c =false;//如果c是true标记登录成功
        if (map.containsValue(p)){
            System.out.println("登录成功");
            c = true;
            wel();
        }else {
            System.out.println("登录失败,请重新登录");
            login();
        }

    }
    //3.wei
    public void wel(){
        System.out.println("welcome");
    }
    //4. exit
    public void exit(){
        System.out.println("马上推出系统");
        System.exit(0);
    }
}
class Part{
    String name;//用户名
    String pass;//密码
    int cid;//卡号
    public Part(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
    public Part(String name, String pass, int cid) {
        this.name = name;
        this.pass = pass;
        this.cid = cid;
    }
    //等下通过map<1,Part>
    //重写 如果不重写，默认情况下 识别地址值
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        Part p = (Part) obj;
        return name.equals(p.name) && pass.equals(p.pass);
    }
}
