package com.fzn2020.day18;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @program: JAVA
 * 描述：  3.有二个类，医生 老师，类中有方法，自己定义。
 *          通过反射和配置文件来完成，在配置文件中设置类名和方法，来调用相应的功能
 * @author: fzn
 * @create: 2020-08-13 18:28
 **/
public class ExeBDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //读取配置文件
        File f = new File("f:"+File.separator+"a.txt");
        //取配置文件的属性
        Properties p = new Properties();
        //通过字节流读取内容
        p.load(new FileInputStream(f));
        String className = (String) p.get("class");//得到类名
        String method = (String) p.get("method");//得到方法名
        System.out.println(className+" "+method);//com.fzn2020.day18.Doctor work
        //调用相应的功能
        Class cla = Class.forName("com.fzn2020.day18.Doctor");
        //得到实例对象
        Object o = cla.newInstance();
        System.out.println(o.getClass().getName());//打印出来   com.fzn2020.day18.Doctor
        Method[] methods = cla.getMethods();
        for (int i = 0; i < methods.length; i++) {
           if (methods[i].getName().equals(method)){
                System.out.println(i);
                methods[i].invoke(o);//方法发到o中，发生效果
            }
        }

    }
}
class Doctor{
    public void eat(){
        System.out.println("医生吃饭");
    }
    public void work(){
        System.out.println("医生在医院上班");
    }

}
class Teacher{
    public void eat(){
        System.out.println("老师吃饭");
    }
    public void work(){
        System.out.println("老师在学校上班");
    }
}
