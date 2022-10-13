package com.fzn2020.day09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 14:57
 **/
public class List3Demo {
    public static void main(String[] args) {
        //System.out.println(ti(new ArrayList()));//80
        //System.out.println(ti(new LinkedList()));//195
        System.out.println(ti(new Vector()));//96
        //综合比较

    }
    public static long ti(List li){//多态的好处
        for (int i = 0; i < 100000; i++) {
            li.add(i);
        }
        long st = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            li.indexOf(89999);
        }
        long en =System.currentTimeMillis();
        return en-st;
    }
}
