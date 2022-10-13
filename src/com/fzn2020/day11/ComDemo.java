package com.fzn2020.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 17:02
 **/
public class ComDemo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("sun");
        li.add("hu");
        li.add("aaa");
        li.add("sabaa");
        Collections.sort(li);//排序 按首字母排序
        System.out.println(li);
        System.out.println("------------");
        //如何按照字符串长度来排序
        By b = new By();
        Collections.sort(li,b);
        System.out.println(li);

    }
}
//自定义排序 重写Comparator
//compare有自己的规范，o1-o2 如果是负数说明第二个值大，
class By implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.charAt(0)-o2.charAt(0);//按照第二个字母的序号 从小到大排序
        //return o1.length()-o2.length();
    }
}
