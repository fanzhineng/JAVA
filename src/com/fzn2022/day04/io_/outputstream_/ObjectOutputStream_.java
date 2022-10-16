package com.fzn2022.day04.io_.outputstream_;

import java.io.*;

/**
 * @program: JAVA
 * 描述：      序列化
 * ObjectOutputStream 演示 完成数据序列化
 * @author: fzn
 * @create: 2022-10-17 01:21
 **/
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        // 序列化后存的不是纯文本而是他的格式
        String fileName = "e:\\a.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));

        // 数据序列化
        // 数字
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.5);
        objectOutputStream.writeUTF("中国");

        // 保存一个Dog对象
        Dog dog = new Dog("旺财", 10);
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
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