package com.fzn2020.day07;

import java.util.Calendar;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-29 09:34
 **/
public class Pri2Demo {
    public static void main(String[] args) {
        //奔驰
        BZPri b = new BZPri();
        b.createAir();
        b.createEn();
        //宝马
        BWM bm = new BWM();
        bm.createAir();
        bm.createEn();

    }
}
//发动机的父类
class Engin{
    int id;
    int hi;//排量
}
//发动机厂商子类
class FT extends Engin{
    public FT(){
        System.out.println("我是丰田公司制造的发动机");
    }
}
class DZ extends Engin{
    public DZ(){
        System.out.println("我是大众公司制造的发动机");
    }
}
class Air{
    String type;
    int pi;
}
class MD extends  Air{
    public MD(){
        System.out.println("美的制造的空调");
    }
}
class GL extends Air{
    public GL(){
        System.out.println("格力制造的空调");
    }
}
//抽象工厂 --BZ公司的需求
interface AbsFact{
    Engin createEn();//找发动机
    Air createAir();//找空调
}
//代理类 奔驰
class BZPri implements AbsFact{
    //代理类，不是自己去完成需求 是
    @Override
    public Engin createEn() {
        return new DZ();
    }

    @Override
    public Air createAir() {
        return new MD();
    }
}
//宝马
class BWM implements AbsFact{

    @Override
    public Engin createEn() {
        return new FT();
    }

    @Override
    public Air createAir() {
        return new GL();
    }
}