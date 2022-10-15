package com.fzn2022.day03.map_;

import java.util.*;

/**
 * @program: JAVA
 * 描述：  Map 六种遍历方式
 * @author: fzn
 * @create: 2022-10-15 14:03
 **/
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        // 第一组 先取出所有的key 通过key 取出对应的value
        Set keySet = map.keySet();
        // 1. 增强for
        System.out.println("----1. 增强for---");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        // 2. 迭代器
        System.out.println("----2. 迭代器---");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 第二组 把所有的values取出
        Collection values = map.values();
        // 这里可以使用所有的 Collection 的遍历方法 但是不普通for 因为没有下标
        // 1. 增强for
        System.out.println("----1. 增强for---");
        for (Object value : values) {
            System.out.println(value);
        }
        // 2. 迭代器
        System.out.println("----2. 迭代器---");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        //第三组 通过 EntrySet 来获取 k-v
        Set set = map.entrySet();
        // 1. 增强for
        System.out.println("----1. 增强for (第三种方式)---");
        for (Object entry : set) {
            // 将 entry 转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() +"-"+ m.getValue());
        }
        // 2. 迭代器
        System.out.println("----2. 迭代器---");
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            // System.out.println(next.getClass());// HashMap$Node
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() +"-"+ m.getValue());
        }
    }
}