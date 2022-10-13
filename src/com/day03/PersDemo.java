package com.day03;

/**
 * @program: JAVA
 * 描述：
 *      父类和子类中的构造器和重写方法。
 * @author: fzn
 * @create: 2020-07-22 17:09
 **/
public class PersDemo {
    public static void main(String[] args) {
        //实例化子类
        Stu s = new Stu("toy");
        System.out.println(s.name);
        System.out.println(s.getName());

    }
}
//父类
class Pers{
    String name;
    //父类构造器
    public Pers(String name){
        this.name = name;
    }

    //有一个实例方法
    public String getName(){
        return name;
    }
    public void pt(){
        System.out.println("我是父类中的pt方法");
    }
}
//子类
class Stu extends Pers{
    String name; //子类属性也可以和父类同名 已自己为主
    //子类构造方法
    public Stu(String name) {
        //调用父类的构造器 父类的name 变成了fan
        super("fan");
        this.name = name;
    }
    //重写父类方法
    @Override
    public String getName(){
        return name;
    }
}
