package com.fzn2020.java0703.day0903;


import com.fzn2020.java0703.day0903.reflection.ClassDemo;
import com.fzn2020.java0703.day0903.reflection.Student;

import java.lang.reflect.Field;

/**
 * @program: JAVA
 * 描述：  反射作业
 *      1、编写一个方法，传入一个类的全路径的字符串，
 *         2、编写一个方法，将对象数组转换成字符串，格式如下：
 * 类型[{属性名1=value1,属性名2=value2},{属性名1=value1,属性名2=value2}].
 * public static String toString(Object[] obj){
 *
 * }
 * 通过反射创建该类的对象并返回
 * @author: fzn
 * @create: 2020-09-03 18:29
 **/
public class EXeADemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Object ref = ref("com.fzn2020.java0703.day0903.reflection.Student");
        System.out.println(ref);
        System.out.println("--------------");
        Student[] students = new Student[]{new Student(),new Student(),new Student()};
        String s = refWork2(students);
        System.out.println(s);
        System.out.println("--------------");
        Object[] objects = new Object[]{new Student(),new ClassDemo()};
        String s2 = refWork2(objects);
        System.out.println(s2);
    }

    /**
     *
     * @param name
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    //作业1
    public static Object ref(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.获取class对象
        Class<?> aClass = Class.forName(name);
        //通过反射创建对象
        Object o = aClass.newInstance();
        return o;
    }

    /**
     *
     * @param objects
     * @return
     * @throws IllegalAccessException
     */
    //作业2
    public static String refWork2(Object[] objects) throws IllegalAccessException {
        StringBuffer str = new StringBuffer();
        //获取数组对象
        Class<? extends Object[]> aClass = objects.getClass();
        String simpleName = aClass.getSimpleName();
        str.append(simpleName);
        //截取出[] 删除
        str = str.delete(str.length()-2, str.length());
        str.append("[");
        //遍历对象
        for (Object object : objects) {
            Class<?> aClass1 = object.getClass();
            String simpleName1 = aClass1.getSimpleName();
            str.append(simpleName1).append("{");
            //获取所有属性
            Field[] declaredFields = aClass1.getDeclaredFields();
            //遍历所有属性
            for (Field field : declaredFields) {
                //设置允许访问
                field.setAccessible(true);
                //得到属性名
                String name = field.getName();
                //得到属性值
                Object o = field.get(object);
                str.append(name).append("=").append(o).append(",");
            }
            str.setCharAt(str.length()-1,'}');
            str.append(",");
        }
        str.setCharAt(str.length()-1,']');
        return str.toString();
    }
}
