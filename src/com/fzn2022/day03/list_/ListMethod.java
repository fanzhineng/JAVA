package com.fzn2022.day03.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：  list常用方法
 * @author: fzn
 * @create: 2022-10-14 16:17
 **/
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        // 在index位置插入元素
        list.add(1,"fzn");
        System.out.println(list);

        // 在index位置插入多个元素
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println(list);

        // 返回对象在集合中的首次位置
        int tom = list.indexOf("tom");
        System.out.println(tom);

        // 返回对象在集合中最后出现的位置
        int fzn = list.lastIndexOf("fzn");
        System.out.println(fzn);

        // 移除指定index元素 并返回次元素
        Object remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);

        // set 设置指定index位置的元素 相当于替换
        list.set(1,"范知能");
        System.out.println(list);

        // 返回从指定位置到结束位置的子集合 左闭右开  [0,2)
        List list1 = list.subList(0, 2);
        System.out.println(list1);
    }
}