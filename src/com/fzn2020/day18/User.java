package com.fzn2020.day18;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-13 15:27
 **/
public class User {
    int id;
    String name;
    int age;
    public User() {
    }
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void work(String type){
        System.out.println("work"+type);
    }
}
