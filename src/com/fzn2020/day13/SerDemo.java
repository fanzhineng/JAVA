package com.fzn2020.day13;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-06 17:21
 **/
public class SerDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person(101,"sun");
        String path = "F:"+File.separator+"sunp.txt";
        //ser(p1,path);
        Person p2 = (Person) fser(path);
        System.out.println(p2);
    }
    //序列化--写入文本
    public static void ser(Object o,String path) throws IOException {
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(path));
        ob.writeObject(o);
        ob.close();
    }
    //读取 反序列化
    public static Object fser(String path) throws IOException, ClassNotFoundException {
        //读
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(path));
        return oi.readObject();
    }

}
//类
class Person implements Serializable{
    //唯一可能性更大
    public static final long serialVersionUID = -6262626262L;//一般从负数开始
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
