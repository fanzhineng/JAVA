package com.fzn2021.day05;

/**
 * @program: JavaSE
 * 描述：      属性与成员变量  是否
 * @author: fzn
 * @create: 2021-12-11 12:57
 **/
public class Object01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "张三";
        cat.age = 18;
        cat.color = "白色";
    }
}

class Cat{
    String name;
    int age;
    String color;
}