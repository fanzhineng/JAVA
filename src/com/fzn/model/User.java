package com.fzn.model;

/**
 * @program: JAVA
 * 描述：  用户类
 * @author: fzn
 * @create: 2020-08-13 19:02
 **/
public class User {
    //用户名
    String name;
    //密码
    String pass;
    //手机号码
    long phone;
    //有参构造器
    public User(String name, String pass, long phone) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
    }

}
