package com.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 15:27
 **/
public class CloDemo {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("sun");
        ar.add("xi");
        ar.add("li");
        ArrayList<String> ar2 = ar;
        System.out.println(ar2==ar);//地址值相同
        System.out.println(ar2.get(0)==ar.get(0));

        //浅复制 ：复制时每一个元素没有真复制，只是复制了内容的地址值
        System.out.println("-----------");
        ArrayList<String> ar3 = (ArrayList<String>) ar.clone();
        //有两份地址
        System.out.println(ar3==ar);//false
        System.out.println(ar3.get(0)==ar.get(0));
        System.out.println("-------------");

        //ArrayList-> linkedList转换
        LinkedList<String> li = new LinkedList<>(ar3);
        System.out.println(li);

        //数组和集合的相互转化
        //数组快速转化成集合
        String[] str = new String[]{"aa","bb","cc","dd"};
        LinkedList<String> li2 = new LinkedList<>();
        //第一种，遍历出来放进去
        for (String s : str) {
            li2.add(s);
        }
        System.out.println(li2);
        System.out.println("--------------");
        //第二种
        List<String> li3= Arrays.asList(str);
        for (String s : li3) {
            System.out.println(s);
        }
        System.out.println("--------------");
        //集合转化为数组
        //1.方法一 遍历一个一个加进去
        //2.方法二
        //String[] array = (String[]) li3.toArray();
        String[] array =li3.toArray(new String[0]);//new String[0]传的是对象的类型。
        System.out.println(Arrays.toString(array));

    }
}
