package com.fzn2020.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 *      3 新建一类，有一个商品(id pri name addr)，通过比较器，
 *   按商品名的首字母倒序， 输出信息.
 * @author: fzn
 * @create: 2020-08-04 19:11
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        List<Sp> li = new ArrayList<>();
        Sp s2 = new Sp(1,100,"ebc","sss");
        Sp s4 = new Sp(2,100,"gbc","sss");
        Sp s1 = new Sp(3,100,"abc","sss");
        Sp s3 = new Sp(4,100,"ubc","sss");
        Collections.addAll(li, s1, s2, s3, s4);
        System.out.println("未排序前");
        System.out.println(li);
        System.out.println("-----------");
        Byx b =new Byx();
        System.out.println("排序后");
        Collections.sort(li,b);
        System.out.println(li);

    }
}
class Sp{
    int id;
    int pri;
    String name;//商品名
    String addr;
    public Sp(int id, int pri, String name, String addr) {
        this.id = id;
        this.pri = pri;
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Sp{" +
                "id=" + id +
                ", pri=" + pri +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
//自定义排序
class Byx implements Comparator<Sp>{
    @Override
    public int compare(Sp o1, Sp o2) {
        int i = o1.name.charAt(0) - o2.name.charAt(0);//首字母排序
        return i;
    }
}
