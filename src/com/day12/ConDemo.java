package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: JAVA
 * 描述：      比较器  Comparator
 * @author: fzn
 * @create: 2020-08-05 09:58
 **/
public class ConDemo {
    public static void main(String[] args) {
        //我们要对 下面几组字符串，进行长度从大到小排列
        List<String> li = new ArrayList<>();
        li.add("aaa");
        li.add("bbb");
        li.add("ccc");
        li.add("cf");
        li.add("uauas");
        By b = new By();
        Collections.sort(li,b);
        System.out.println(li);

    }
}
//比较器  Comparator
class By implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -(o1.length()-o2.length());
    }
}

