package com.day18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-13 15:30
 *
 * reflection
 **/
public class UserDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        UserDemo u = new UserDemo();
        u.ref("com.day18.User");
    }
    public void ref(String fName) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //得到类中所有的属性和方法
        Class cla = Class.forName(fName);
        //得到所有的属性
        Field[] f = cla.getDeclaredFields();
        System.out.println("------所有的属性和属性的类型----");
        for (Field field : f) {
            System.out.println(field.getName()+" "+field.getType());
        }
        System.out.println("-----所有的方法和方法的返回值-----");
        //得到所有的方法
        Method[] methods = cla.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+" "+method.getReturnType());
        }
        System.out.println("--------使用其方法和属性-------");
        User u1 = (User) cla.newInstance();
        u1.id=1;
        u1.age=18;
        u1.name="sun";
        System.out.println(u1.id+" "+u1.name+" "+u1.age);
        u1.work("程序员");
        System.out.println("-----所有的构造器----");
        //得到所有的构造器
        Constructor[] constructors = cla.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----通过构造器得到其属性和方法----");
        //通过构造器得到对象，再用其方法
        User u = (User) constructors[1].newInstance(1, "2", 3);
        System.out.println(u.id);
        System.out.println(u.name);
        System.out.println(u.age);
        u.work("白领");
    }
}
