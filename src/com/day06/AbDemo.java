package com.day06;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-28 09:26
 **/
public class AbDemo {
    public static void main(String[] args) {
        //多态
        Aba a = new Cb();
        a.eat();
        a.move();
    }
}

//抽象类
abstract class Aba{
    public void eat(){
        System.out.println("人吃东西");
    }
    abstract void move();
}
//一个具体类继承抽象类，要实现其抽象方法
//实例方法不用实现
class Cb extends Aba{

    @Override
    void move() {
        System.out.println("小孩在走路");
    }
}