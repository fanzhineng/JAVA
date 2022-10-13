package com.fzn2020.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @program: JAVA
 * 描述：      通过配置文件的方式反射
 * @author: fzn
 * @create: 2020-08-13 16:03
 **/
public class SerDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        File f = new File("F:"+File.separator+"sp.txt");
        //取配置文件的属性和属性值  Properties取配置文件的类
        Properties config = new Properties();
        config.load(new FileInputStream(f));//通过字节流 读内容
        String className = (String) config.get("class");//这个class指的是配置文件中定义的属性名
        String me = (String) config.get("method");
        System.out.println(className+" "+me);
        System.out.println("-----------");
        //下面开始使用反射
        Class cla = Class.forName(className);
        Object o = cla.newInstance();//得到实例
        System.out.println(o.getClass().getName());
        Method[] mm = cla.getMethods();//得到方法
        for (int i = 0; i < mm.length; i++) {
            if (mm[i].getName().equals(me)){
                System.out.println(i);
                mm[i].invoke(o);//把mm[0]这个方法来放到对象o中，发生效果
            }
        }

    }
}

class SerA{
    public void doa(){
        System.out.println("serA doa");
    }
    public void dob(){
        System.out.println("serA dob");
    }

}
class SerB{
    public void doa(){
        System.out.println("serB doa");
    }
    public void dob(){
        System.out.println("serB dob");
    }

}
class SerC{
    public void doa(){
        System.out.println("serC doa");
    }
    public void dob(){
        System.out.println("serC dob");
    }
}
