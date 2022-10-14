package com.fzn2022.day03.list_.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：ArrayList 的注意事项
 *      1. 可以加入多个null
 *      2. 是由数组来实现存储的
 *      3. 基本等同于Vector,除了 ArrayList 的线程不安全（执行效率高）
 *          在多线程的情况下，不建议使用 ArrayList
 * @author: fzn
 * @create: 2022-10-14 16:46
 **/
public class ArrayListDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // ArrayList 是线程不安全的 可以看源码 没有 synchronized 修饰
        /*
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        System.out.println(arrayList);
    }
}