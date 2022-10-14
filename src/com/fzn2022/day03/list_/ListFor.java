package com.fzn2022.day03.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: JAVA
 * 描述：  list 三种遍历方式
 * @author: fzn
 * @create: 2022-10-14 16:30
 **/
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        // 迭代器 遍历
        System.out.println("=====迭代器 遍历=====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj"+obj);
        }

        // 增强for循环
        System.out.println("=====增强for循环=====");
        for (Object obj : list) {
            System.out.println("obj"+obj);
        }

        // 传统for循环
        System.out.println("=====传统for循环=====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("obj"+list.get(i));
        }
    }
}