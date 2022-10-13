package com.fzn2020.day03;

/**
 * @program: JAVA
 * 描述：
 *      书类
 * @author: fzn
 * @create: 2020-07-22 11:40
 **/
public class Book {
    //属性
    int id;//编号
    String name;//书名
    String[] users;//作者

    //方法
    public void read(){
        System.out.println("书用来读。");
    }
    //写构造器，默认构造器。无参
    public Book(){
        System.out.println("I am book");
    }
    //有参构造器
    public Book(int id,String name,String[] users){
        //this 指的是当前的 刚new出来的那个对象
        this.id = id;
        this.name = name;
        this.users = users;
    }
}
