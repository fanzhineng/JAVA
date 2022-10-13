package java0703.day0903.reflection;

/**
 * @program: JAVA
 * 描述：  反射
 *          获取Class对象的三种方式
 * @author: fzn
 * @create: 2020-09-03 14:32
 **/
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象的三种方式
        //1.Class.forName()
        Class<ClassDemo> aClass = (Class<ClassDemo>) Class.forName("java0703.day0903.reflection.ClassDemo");
        System.out.println(aClass);
        Class<ClassDemo> strClass = (Class<ClassDemo>) Class.forName("java.lang.String");
        System.out.println(strClass);
        //2.类名.Class
        Class<ClassDemo> classDemoClass = ClassDemo.class;
        System.out.println(classDemoClass);
        //获取到的Class对象为同一个对象。
        System.out.println(classDemoClass==aClass);
        //3.对象.getClass()方法获取Class对象
        ClassDemo classDemo = new ClassDemo();
        Class aClass1 = classDemo.getClass();
        System.out.println(aClass1.getName());
        System.out.println(classDemoClass==aClass1);
    }
}
