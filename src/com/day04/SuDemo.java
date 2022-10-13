package com.day04;

/**
 * @program: JAVA
 * 描述：
 *      super 两种使用方法。
 * @author: fzn
 * @create: 2020-07-23 14:31
 **/

public class SuDemo {
    public static void main(String[] args) {
        //1.super 调用构造器
        //Circle c = new Circle();
        Circle c = new Circle(20);
        System.out.println("--------");
        //2.通过super调用父类中的方法 super.getArea();
        c.getArea();
        System.out.println("--------");
        c.getA2();
    }
}
//父类  图形
class Shape{
    int hi;//高
    int wi;//宽
    //默认构造器
    public Shape(){
        System.out.println("这是父类的构造器");
    }
    //有参构造器
    public Shape(int hi){
        this.hi = hi;
        System.out.println(hi+"父类的一个有参构造器");
    }
    //方法
    public int getArea(){
        int ar = 100;
        System.out.println("父类中的得到面积的方法");
        return ar;
    }
}
//子类 圆
class Circle extends Shape{

    public Circle(){
        super();
        System.out.println("我是子类的构造器");
    }
    public Circle(int hi){
        super(hi);
        System.out.println("我是子类的一个有参构造器");
    }
    //重写父类的方法
    @Override
    public int getArea(){
        super.getArea();//调用父类中的getArea方法
        System.out.println("我是子类中的getArea");
        return 200;
    }
    public int getA2(){
        super.getArea();//调用父类中的getArea方法
        System.out.println("我是子类中的getA2");
        return 300;
    }
}