package com.fzn2020.day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 10:55
 **/
public class HashSetDemo {
    public static void main(String[] args) {
        /*
        Set<Student> s = new HashSet<>();
        Student s1 = new Student("sun",18,3601122);
        Student s2 = new Student("sxi",18,3601123);
        Student s3 = new Student("sxi",18,3601124);
        Student s4 = new Student("sun",18,3601122);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        for (Student stu : s) {
            System.out.println(stu);
        }
         */
        //Integer
        Set<Integer> sa = new HashSet<>();
        sa.add(1);
        sa.add(1);
        sa.add(2);
        sa.add(3);
        sa.add(5);
        sa.add(4);
        for (Integer a : sa) {
            System.out.println(a);
        }
        //删除元素
        sa.remove(2);
        System.out.println("--------------");
        //String
        Set<String> str = new HashSet<>();
        str.add("sun");
        str.add("sun");
        str.add("ab");
        str.add("ca");
        str.add("li");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println("--------------");
        //已知一个数组 去掉重复元素
        int[] ary =new  int[]{1,1,1,1,2,2,2,5,5,2,3,4};
        Set<Integer> set = new HashSet<>();
        for (int i : ary) {
            set.add(i);
        }
        System.out.println(set);
    }
}

class Student{
    String name;
    int age;
    int code;//身份证
    public Student(String name, int age, int code){
        this.name = name;
        this.age = age;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code=" + code +
                '}';
    }
    //重写equals
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Student){
            Student s = (Student) obj;
            return this.name.equals(s.name) && this.code ==s.code && this.age ==s.age;
        }
        return false;
    }
    //重写hashCode
    public int hashCode(){
        return this.name.hashCode()+this.code*3;
    }
}
