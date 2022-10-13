package com.fzn2021.day16;

import java.util.ArrayList;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-12 13:46
 **/
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",10));
        arrayList.add(new Dog("小黄",10));
        for (Dog dog : arrayList) {
            System.out.println(dog);
        }
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}