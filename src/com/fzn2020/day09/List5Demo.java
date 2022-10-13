package com.fzn2020.day09;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 15:50
 **/
public class List5Demo {
    public static void main(String[] args) {
        User u1 = new User(101,"sun",18);
        User u2 = new User(101,"hu",19);
        User u3 = new User(101,"xie",20);
        //先把u1 u2 u3 当成String。 只是User类型
        List<User> li = new ArrayList<>();//<内的内容可省去不写>
        li.add(u1);
        li.add(u2);
        li.add(u3);
        for (User u : li) {
            System.out.println(u.id+" "+u.name+" "+u.age);
        }
        System.out.println(new Integer(1).equals(new Long(1)));

    }
}
//具体类
class User{
    int id;
    String name;
    int age;
    public void work(){
        System.out.println("人是要运动的");
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
