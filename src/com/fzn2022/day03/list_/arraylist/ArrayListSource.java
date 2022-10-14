package com.fzn2022.day03.list_.arraylist;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: JAVA
 * 描述：      ArrayList 底层结构源码分析
 *             1. ArrayList 中维护了一个Object类型的数组 elementData
 *                  transient Object[] elementData;     transient 表示瞬间 表示该属性不会被序列化
 *             2. 当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0
 *                 第一次添加，则扩容elementData为10 如需要扩容，则扩容elementData为1.5倍
 *             3. 如果使用的是指定大小的构造器，则初始elementData容量为指定大小，
 *                  如果需要扩容，则直接扩容elementData为1.5倍
 * @author: fzn
 * @create: 2022-10-14 16:54
 **/
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // 使用无参构造器创建ArrayList对象
        // ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(8);
        // 使用for给list添加1-10数据
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        // 使用for给list添加11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}