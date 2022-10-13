package com.fzn2021.day11;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-22 16:19
 **/
public class HomeWork1 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("jack",10,"JavaSe");
        people[1] = new Person("tom",20,"大数据");
        people[2] = new Person("marry",15,"PHP");

        Person tmp =null;
        for (int i = 0; i < people.length -1; i++) {
            for (int j = 0; j < people.length - 1 -i; j++) {
                if (people[i].getAge() < people[i+1].getAge()){
                    tmp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = tmp;
                }
            }
        }

        System.out.println("排序后的效果");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}