package com.day08;

import java.util.HashMap;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-30 11:01
 **/
public class PerDemo {
    public static void main(String[] args) {
        Person p1 = new Person("sun",18);

        HashMap<Person,Integer> m = new HashMap<>();
        m.put(p1,1001);//key p1 值1001
        Person p2 =new Person("sun",18);
        //p2 也是sun 18 取不到1001
        System.out.println(m.get(p2));
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //先重写equals 先要证明两个对象时相同的
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){//同一对象
            return true;
        }
        if (obj instanceof  Person){//判断传入的对象是不是UserA class实例化出来的。
            Person o = (Person) obj;
            return this.name == o.name && this.age == o.age;
        }
        return false;
    }
    //重写hashCode(用到对象的属性，自己重组一个算法)
    public int hashCode(){
        return name.hashCode()*10000+age;
    }
}