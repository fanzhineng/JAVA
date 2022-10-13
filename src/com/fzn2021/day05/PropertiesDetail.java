package com.fzn2021.day05;

/**
 * @program: JavaSE
 * 描述：      对象的引用
 * @author: fzn
 * @create: 2021-12-11 13:15
 **/
public class PropertiesDetail {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("李四");
        person.setAge(0);
        person.setSex("男");
        System.out.println(person);

        // 对象是引用传递  地址传递
        Person p2 = person;
        p2.setName("111");
        p2.setAge(18);
        System.out.println(person);
        System.out.println(p2);

    }
}

class Person{
    private String name;
    private  int age;
    private String sex;


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}