package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 *      3 新建一个类，有人的类，(id name addr)
 *   通过比较器，得到所有的人按家庭地址字符串长度，排序。从小到大.
 * @author: fzn
 * @create: 2020-08-05 18:44
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        Person p1 = new  Person(1,"xiaomi","abcdedf");
        Person p2 = new  Person(2,"sun","dedf");
        Person p3 = new  Person(3,"hu","cdedf");
        List<Person> li = new ArrayList<>();
        Collections.addAll(li,p1,p2,p3);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);

    }
}
class Person implements Comparable {
    int id;
    String name;
    String addr;

    public Person(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.addr.length()-p.addr.length();
    }
}
