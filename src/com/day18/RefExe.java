package com.day18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: JAVA
 * 描述：      已知Ref0.class文件 使用里面的方法
 * @author: fzn
 * @create: 2020-08-13 11:45
 **/
public class RefExe {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //ref("Ref0");
        ref2("com.day18.Ref0");//找的时候要指定具体位置 指定包
    }
    //使用反射
    public static void ref2(String fName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cla = Class.forName(fName);
        System.out.println(cla.getName());//得到类名
        Field[] fs = cla.getDeclaredFields();//得到所有的属性
        //遍历所有属性
        for (Field f : fs) {
            System.out.println(f.getName()+" "+f.getType());//得到属性名 和属性的类型
        }
        //得到类中的所有方法
        Method[] me = cla.getMethods();
        for (Method m : me) {
            System.out.println(m.getName()+" "+ m.getReturnType());//得到所有方法 和方法的返回类型
        }
        System.out.println("----------");
        //先要得到对象 默认是T类型 强转
        Ref0 r = (Ref0) cla.newInstance();//得到Ref0对象
        System.out.println(r.i);
        System.out.println(r.name);
        r.dos("南昌红谷滩");
        r.eat();
        System.out.println("----------");
        //得到构造器数组
        Constructor[] cs = cla.getConstructors();//得到所有构造器
        for (Constructor c : cs) {
            System.out.println(c);
        }
        System.out.println("----------");
        //通过构造器得到对象
        Ref0 r0 = (Ref0) cs[0].newInstance(1, "sun");
        System.out.println(r0.i);
        System.out.println(r0.name);

    }

    //不用反射
    public static void ref(String fName){
        Ref0 r0 = new Ref0();
        //1.正常情况下出结果    new对象，得到Class对象
        System.out.println(r0.i);
        System.out.println(r0.name);
        //通过new对象.class
        Class ca = r0.getClass();//返回一个Class 类型ca
        //因为r0继承Object，Object有一个方法为getClass
        System.out.println(ca.getName());//com.day18.Ref0
        System.out.println("------------");
        //2.通过Class直接得到对象
        Class ca2 = Ref0.class;//得到Class类型的ca2
        System.out.println(ca2.getName());//com.day18.Ref0
        System.out.println(ca==ca2);//true 因为都是指Ref0这个文件

    }
}
