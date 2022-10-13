package com.day06;

/**
 * @program: JAVA
 * 描述：  代理模式
 * 新建文件，自己定义类，完成代理模式.
 * @author: fzn
 * @create: 2020-07-28 18:30
 **/
public class DaLiDemo {
    public static void main(String[] args) {
        //使用代理模式
        Person p = new  Person(1);
        p.play();
        p.listen();
        Person p2 =new Person(0);
        p2.play();
        p2.listen();
    }
}
//需求 打游戏 听歌
interface Computer{
    abstract void play();
    abstract void listen();
}
//Dell类
class Dell implements Computer {

    @Override
    public void play() {
        System.out.println("用Dell电脑打游戏");
    }

    @Override
    public void listen() {
        System.out.println("用Dell电脑听歌");
    }
}
//HuiPu
class HuiPu implements Computer{

    @Override
    public void play() {
        System.out.println("用HuiPu电脑打游戏");
    }

    @Override
    public void listen() {
        System.out.println("用HuiPu电脑听歌");
    }
}
//人类
class Person implements Computer{
    //定义电脑的属性
    Computer com;
    //通过构造器 实现代理
    public Person(int i){
        if (i==0){//发生多态
            com = new Dell();
        }else if (i == 1){
            com = new HuiPu();
        }
    }
    @Override
    public void play() {
        com.play();
    }

    @Override
    public void listen() {
        com.listen();
    }
}
