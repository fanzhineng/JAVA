package com.day12;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 10:04
 **/
public class Con2Demo {
    public static void main(String[] args) {
        String s1 = "CFE";
        String s2 = "EGD";
        String s3 = "CCD";
        /*
            当长度相同时，先比首字母，着差
         */
        System.out.println(s1.compareTo(s2));//String类型 默认先比较第一个字母的大小
        System.out.println(s1.compareTo(s3));//如果第一个字母相同，比较后面的
        /*
            当长度不同，字母相同时，自己先用长度比较
         */
        String a = "hello";
        String b ="hel";
        System.out.println(a.compareTo(b));//2
        /*
        当长度不同，字母也不同，先找到相同的字母，再用后面的比较
         当长度不同，字母完全不同，直接比较第一个
         */
        String c = "abcda";
        String d = "xy";
        String e = "by";
        System.out.println(c.compareTo(d));//a-x
        System.out.println(c.compareTo(e));//a-b
        System.out.println("------------");
        Stu stu1 = new Stu(101,"sun",18);
        Stu stu2 = new Stu(105,"li",23);
        Stu stu3 = new Stu(103,"hu",17);
        ArrayList<Stu> arr = new ArrayList<>();
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        Collections.sort(arr);//因为实现了比较器
        //迭代器
        Iterator<Stu> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
//用自己写的类
class Stu implements Comparable{
    int id;
    String name;
    int age;

    public Stu(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Stu s = (Stu) o;
        return (this.id-s.id);//如果是负数 说明传入的大
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
