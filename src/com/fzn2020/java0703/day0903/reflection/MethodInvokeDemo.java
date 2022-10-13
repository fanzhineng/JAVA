package com.fzn2020.java0703.day0903.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: JAVA
 * 描述：  演示反射调用方法
 * @author: fzn
 * @create: 2020-09-03 16:06
 **/
public class MethodInvokeDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //1.获取Class对象
        Class<?> aClass = Class.forName("com.fzn2020.java0703.day0903.reflection.Student");
        Object o = aClass.newInstance();
        //2.获取到需要调用的方法对象
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        //3.调用method的invoke方法
        //invoke（对象，方法实参列表...）==> o.setName("张珊")
        setName.invoke(o,"张珊");
        System.out.println(o);

        //属性的操作
        //2.获取属性对象
        Field age = aClass.getDeclaredField("age");
        //设置允许操作访问
        age.setAccessible(true);
        //设置属性 set（对象,属性的值)
        age.set(o,18);
        //得到属性
        System.out.println(age.get(o));
        System.out.println(o);

    }
}
