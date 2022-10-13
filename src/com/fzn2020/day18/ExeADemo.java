package com.fzn2020.day18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: JAVA
 * 描述：
 *
            2.有个类，类是电话卡，有三个方法，
        用 掉的的流量，通话，余额，有二个构造器。
        构 造器参数自己定，
            要通过反射，得到所有的属性和方法，和得到构造器，并得到对象，并能调用 其方法。
 * @author: fzn
 * @create: 2020-08-13 17:39
 **/
public class ExeADemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //通过反射得到其属性和方法 构造器 并得到其对象
        Class cla = Class.forName("com.fzn2020.day18.Card");
        //得到其属性和属性的类型
        Field[] fields = cla.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName()+" "+f.getType());
        }
        System.out.println("-----------");
        //得到其方法和返回类型
        Method[] methods = cla.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName()+" "+m.getReturnType());
        }
        System.out.println("---------");
        //并得到其对象
        Card ca = (Card) cla.newInstance();
        System.out.println(ca.over);
        ca.call();
        ca.flow();
        ca.getOver();
        System.out.println("-------");
        //得到构造器
        Constructor[] constructors = cla.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println("----------");
        //通过构造器得到其属性和方法
        Card ca2 = (Card) constructors[1].newInstance(1000);
        System.out.println(ca2.over);
        ca2.getOver();
        ca2.flow();
        ca2.call();

    }
}
class Card{
    int over=100;

    public Card() {
    }
    public Card(int over) {
        this.over = over;
    }

    //使用的流量
    public void flow(){
        System.out.println("使用了50M流量");
    }
    //通话
    public void call(){
        System.out.println("通话了一小时");
    }
    //余额
    public void getOver(){
        System.out.println("余额还有"+over);
    }
}
