package com.day06;

/**
 * @program: JAVA
 * 描述：  工厂模式:
 *              工厂：按照传入的参数，出相应的对象
 *         有一个工厂类或方法，专门负责按照参数，生成相应的对象。
 * @author: fzn
 * @create: 2020-07-28 11:50
 **/
public class FactDemo {
    public static void main(String[] args) {
       //不使用工厂模式
        Aper a1 = new Stu();//能看到其对象
        a1.eat();
        a1.work();
        System.out.println("---------------");
        //使用工厂模式
        FactDemo f = new FactDemo();
        Aper a3 = f.getI(1);//传入参数 出相应的对象 不能看到其对象保证安全
        a3.eat();
        a3.work();

    }
    //定义一个方法  Aper为返回值 发生多态
    public Aper getI(int i){
        if (i==0){
            return new Stu();
        }else if (i==1){
            return new Tea();
        }else {
            return null;
        }
    }

}
//接口。因为要使用多态来开发
//人
interface Aper{
    abstract void eat();
    abstract void work();
}
//学生类
class Stu implements Aper{

    @Override
    public void eat() {
        System.out.println("学生在学校在吃饭");
    }

    @Override
    public void work() {
        System.out.println("学生主要事宜是学习");
    }
}
//老师类
class Tea implements Aper{

    @Override
    public void eat() {
        System.out.println("老师在学校吃饭");
    }

    @Override
    public void work() {
        System.out.println("老师的主要事宜就是教书");
    }
}

