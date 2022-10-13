package com.day12;

import java.net.SocketTimeoutException;
import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-05 11:28
 **/
public class Con3Demo {
    public static void main(String[] args) {
        String str = "abcdefghijkm";//12
        Random rd = new Random();
        StringBuffer sf = new StringBuffer();
        for (int j = 0; j < 5; j++) {
            int n = rd.nextInt(12);
            sf.append(str.charAt(n));
        }
        StringBuffer name =sf;
        int id = rd.nextInt(10);
        int score = rd.nextInt(100);
        Student s1 = new Student(id,name,score);

        StringBuffer sf1 = new StringBuffer();
        for (int j = 0; j < 5; j++) {
            int n = rd.nextInt(12);
            sf1.append(str.charAt(n));
        }
        StringBuffer name1 =sf;
        int id1 = rd.nextInt(10);
        int score1 = rd.nextInt(100);
        Student s2 = new Student(id1,name1,score1);
        StringBuffer sf2 = new StringBuffer();
        for (int j = 0; j < 5; j++) {
            int n = rd.nextInt(12);
            sf2.append(str.charAt(n));
        }
        StringBuffer name2 =sf;
        int id2 = rd.nextInt(10);
        int score2 = rd.nextInt(100);
        Student s3 = new Student(id2,name2,score2);

        List<Student> li = new ArrayList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        System.out.println("最低分："+li.get(0).score);
        System.out.println("最高分:"+li.get(li.size()-1).score);
    }
    public static void getName(){

    }
}

class Student implements Comparable{
    int id;
    StringBuffer name;
    int score;

    public Student(int id, StringBuffer name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.score-s.score;
    }
}
