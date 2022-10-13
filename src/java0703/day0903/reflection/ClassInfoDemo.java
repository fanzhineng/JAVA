package java0703.day0903.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：  通过class获取类的信息
 * @author: fzn
 * @create: 2020-09-03 14:49
 **/
public class ClassInfoDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //1.获取Class对象
        Class studentClass = Class.forName("java0703.day0903.reflection.Student");
        //获取Class的名称
        String className = studentClass.getName();
        System.out.println("类名："+className);
        //simpleName 简称
        String simpleName = studentClass.getSimpleName();
        System.out.println("simpleName:"+simpleName);
        //typeName 类型名称
        String typeName = studentClass.getTypeName();
        System.out.println("typeName:"+typeName);
        //包名
        Package aPackage = studentClass.getPackage();
        System.out.println("Package"+aPackage);
        //父类和父接口
        Class superclass = studentClass.getSuperclass();
        System.out.println("继承的父类："+superclass);
        Class[] interfaces = studentClass.getInterfaces();
        System.out.println("实现的接口："+interfaces[0]);
        System.out.println("-----------------------");
        //属性
        //根据属性名获取属性
        Field name = studentClass.getDeclaredField("name");
        System.out.println(name);
        //获取所有声明的属性
        Field[] declaredFields = studentClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
        System.out.println("-----------------------");
        //方法信息
        //根据方法签名获取（方法名+参数列表）
        Method compareTo = studentClass.getDeclaredMethod("compareTo",Student.class);
        System.out.println(compareTo);
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));
        //构造方法信息
        Constructor[] declaredConstructors = studentClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));
    }
}
