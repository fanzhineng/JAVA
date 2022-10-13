package com.day08;

import java.util.HashMap;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-30 11:37
 **/
public class StuDemo {
    public static void main(String[] args) {
        Stu s1 = new Stu(2023,"小明",18,"xaidha");
        Stu s2 = new Stu(2023,"小明",18,"xaidha");
        Stu s3 = new Stu(2023,"小明",18,"xaidha");
        HashMap<Stu,String> m = new HashMap<>();
        m.put(s1,"小明三年级一班");//key p1 值1001
        System.out.println(m.get(s2));
        System.out.println(m.get(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
class Stu{
    int code;
    String name;
    int age;
    String addr;

    public Stu(int code, String name, int age, String addr) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    //先重写equals 先要证明两个对象时相同的
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){//同一对象
            return true;
        }
        if (obj instanceof  Stu){//判断传入的对象是不是UserA class实例化出来的。
            Stu o = (Stu) obj;
            return this.name == o.name && this.code == o.code;
        }
        return false;
    }
    //重写hashCode(用到对象的属性，自己重组一个算法)
    public int hashCode(){
        return name.hashCode()*10000+code+age;
    }
}
