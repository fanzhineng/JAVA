package com.fzn2020.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 *      4 新建一个类，增加多个商品对象，通过调用Collections的方法对其打乱，排序。
 * @author: fzn
 * @create: 2020-08-04 19:24
 **/
public class ExeCDemo {
    public static void main(String[] args) {
        Sp s2 = new Sp(1,100,"ebc","sss");
        Sp s4 = new Sp(2,100,"gbc","sss");
        Sp s1 = new Sp(3,100,"abc","sss");
        Sp s3 = new Sp(4,100,"ubc","sss");

        List<Sp> li = new ArrayList<>();
        Collections.addAll(li, s1, s2, s3, s4);
        System.out.println(li);
        //打乱
        Collections.shuffle(li);
        System.out.println(li);
        //排序
        Byx b = new Byx();
        Collections.sort(li,b);
        System.out.println(li);

    }
}
