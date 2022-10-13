package com.day07;

/**
 * @program: JAVA
 * 描述：      instanceof 用来检测类的类型
 * @author: fzn
 * @create: 2020-07-29 16:33
 **/
public class InstDemo {
    public static void main(String[] args) {
        int i =12;
        //编译不通过 语法错误 i没有class
        //System.out.println(i instanceof Integer);
        //最基本的用法
        Integer ia = new Integer(13);
        System.out.println(ia instanceof Integer);//t
        //有一种特殊情况，null 指的是任何引用类型 只是没有内容。
        //编译可通过，只是返回值为false
        System.out.println(null instanceof Object);//f
        System.out.println("----------");

        Person p1 = new Person();
        Person p2 = new Dor();
        Dor d = new Dor();
        System.out.println(p1 instanceof Person);//t
        //p1 不是Dor class的引用
        System.out.println(p1 instanceof Dor);//f
        //p2这个变量定义时，就是Person类型
        System.out.println(p2 instanceof Person);//t
        //instanceof 支持继承关系 d是子类 也是Person class的引用
        System.out.println(d instanceof Person);//t
        System.out.println("-------------------------");
        Iper i1 = new Stu();
        Iper i2 = new XiaoM();
        Iper i3 = new Tea();
        System.out.println(i1 instanceof Iper);//t
        System.out.println(i2 instanceof Iper);//t
        System.out.println(i3 instanceof Iper);//t
    }
}
class Person{
    int id;
    String name;
}
class Dor extends Person{

}
//接口
interface Iper{
    public void work();
}
class Stu implements Iper{

    @Override
    public void work() {
        System.out.println("学生是来学习的");
    }
}
class XiaoM extends Stu{
    //子类
}
class Tea implements Iper{

    @Override
    public void work() {
        System.out.println("老师是教学的");
    }
}
