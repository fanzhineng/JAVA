package com.fzn2020.day05;

import java.net.SocketTimeoutException;

/**
 * @program: JAVA
 * 描述：
 *      多态的使用
 *          2）使用抽象类的方式
 * @author: fzn
 * @create: 2020-07-27 11:35
 **/
public class AniDemo {
    public static void main(String[] args) {
       // Animal animal =new Animal(); 抽象类不能实例化
        //多态 把子类对象给父类
        //鸟类
        Animal a1 = new Bird(101,"小鸟",2,"red");
        a1.aet();
        a1.moves();
        System.out.println(a1.id+" "+a1.name+" "+a1.age);
        //狗
        Animal a2 = new Dog(102,"旺财",4,"波斯");
        a2.aet();
        a2.moves();
        System.out.println(a2.id+" "+a2.name+" "+a2.age);
        //System.out.println(a2.type); 多态不能调用子类特有的
        //鱼类
        Animal a3 = new Fish();
        a3.aet();
        a3.moves();
    }
}
//父类 --抽象类--abstract
abstract class Animal{
    int id;
    String name;
    int age;
    public void aet(){
        System.out.println("动物吃东西");
    }
    //抽象方法--abstract
    public abstract void moves();
    //无参构造器
    public Animal(){

    }
    //有参构造器
    public Animal(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
//子类继承抽象父类  子类必须重写父类的抽象方法
class Bird extends Animal{
    String color;//颜色
    public Bird(int id, String name, int age, String color){
        super(id, name, age);
        this.color = color;
    }

    //重写父类的抽象方法
    public void moves(){
        System.out.println("鸟在天上飞");
    }
}
//狗类
class Dog extends Animal{
    String type;//类型
    public Dog(int id, String name, int age, String type){
        super(id, name, age);
        this.type = type;
    }
    //重写父类的抽象方法
    public void moves() {
        System.out.println("狗在地上跑");
    }
}
//鱼类
class Fish extends Animal{
    //重写父类的抽象方法
    public void moves() {
        System.out.println("鱼在水中游");
    }
}
