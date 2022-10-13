package com.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: JAVA
 * 描述：
 *  4 新建一个类，用map对一个Student(name age code)
 * 数据自己赋好，增加，修改 删除 查。
 * @author: fzn
 * @create: 2020-08-03 19:36
 **/
public class ExeCDemo {
    public static void main(String[] args) {
        Stu s1 = new Stu("fzn",20,362201);
        Stu s2 = new Stu("li",23,362202);
        Stu s3 = new Stu("zhu",22,362203);
        Map<Integer,Stu> m = new HashMap<>();
        //增加
        m.put(1,s1);
        m.put(2,s2);
        m.put(3,s3);
        System.out.println(m);
        System.out.println("--------1--------");
        //修改
        Stu s4 = new Stu("hu",24,362204);
        m.put(1,s4);
        System.out.println(m);
        System.out.println("---------2-------");
        //删除
        m.remove(2);
        System.out.println(m);
        System.out.println("---------3-------");
        //查 利用增强for循环
        Set<Integer> se = m.keySet();
        for (Integer s : se) {
            System.out.println(s);//s取key
            System.out.println(m.get(s));//取value
        }
        System.out.println("---------4-------");
        //利用迭代器
        Iterator<Map.Entry<Integer, Stu>> itx = m.entrySet().iterator();
        while (itx.hasNext()){
            //System.out.println(itx.next().getKey());//得到key
            System.out.println(itx.next().getValue());//得到value
        }
    }
}
class Stu{
    String name;
    int age;
    int code;
    public Stu(String name, int age, int code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code=" + code +
                '}';
    }
}
