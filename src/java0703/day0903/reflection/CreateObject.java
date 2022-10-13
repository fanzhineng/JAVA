package java0703.day0903.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: JAVA
 * 描述：  通过反射创建对象演示
 * @author: fzn
 * @create: 2020-09-03 15:46
 **/
public class CreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.获取到class对象
        Class<?> aClass = Class.forName("java0703.day0903.reflection.Student");
        //2.调用newInstance方法,通过无参构造来创建对象
        Student student = (Student) aClass.newInstance();
        System.out.println(student);
        //3.获取构造器  通过有参构造器获取对象
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class,int.class);
        //设置允许访问私有构造
        constructor.setAccessible(true);
        //调用构造方法
        Student stu = (Student) constructor.newInstance("张三", 18);
        System.out.println(stu);
    }
}
