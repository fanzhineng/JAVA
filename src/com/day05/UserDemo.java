package com.day05;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-27 10:30
 **/
public class UserDemo {
    public static void main(String[] args) {
        User u =new User();
        u.setName("fzn");
        u.setPass("123456");
        System.out.println(u.getName());
        System.out.println(u.getPass());
    }

}
