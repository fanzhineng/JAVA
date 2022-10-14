package com.fzn2022.day03.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：      Collection集合中的方法
 * @author: fzn
 * @create: 2022-10-14 15:04
 **/
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        // add 添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list"+list);

        // remove 删除指定元素
        list.remove(0);
        list.remove("jack");
        System.out.println("list"+list);

        // contains 查找元素是否存在
        boolean contains = list.contains(10);

        // 获取元素个数
        int size = list.size();
        System.out.println("size："+size);

        // 判断是否为空
        boolean empty = list.isEmpty();
        System.out.println(empty);
        // clean 清空
        list.clear();
        System.out.println(list);

        // 添加多个元素
        List list2 = new ArrayList();
        list2.add("1");
        list2.add("2");
        list.addAll(list2);
        System.out.println(list);

        // 判断多个元素是否存在
        boolean b = list.containsAll(list2);
        System.out.println(b);

        // 删除多个元素
        list.removeAll(list2);
        System.out.println(list);
    }
}