package com.fzn2020.day10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 15:20
 **/
public class ItDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("aa");
        arr.add("sun");
        arr.add("li");
        arr.add("ab");
        //加强for循环
        for (String a : arr) {
            System.out.println(a);
        }
        System.out.println("-------------");
        //迭代器
        //ArrayList集合中有一个方法得到迭代器iterator(); 返回类型也是迭代器
        Iterator<String> it = arr.iterator();
        while (it.hasNext()){//如果还有下一个值
            System.out.println(it.next());
        }

    }
}
