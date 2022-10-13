package com.fzn2021.day12;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.awt.*;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-04 13:29
 **/
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}

/**
 * 单例
 * 构造器私有化
 */
class GirlFriend {
    private  static final GirlFriend gf = new GirlFriend("lhj");

    private String name;

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * 懒汉式
 *  存在线程安全问题
 */
class Cat{
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("tom");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}