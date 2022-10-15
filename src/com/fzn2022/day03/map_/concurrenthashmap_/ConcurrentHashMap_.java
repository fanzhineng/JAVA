package com.fzn2022.day03.map_.concurrenthashmap_;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: JAVA
 * 描述：  ConcurrentHashMap  线程安全的 JUC下面的一个包
 *          1.7之前是通过lock锁 分段锁
 *          1.8 是 数组+链表+红黑树   改为 synchronized
 *              对 val 和 next 都用了 volatile 关键字，保证了可见性。
 * @author: fzn
 * @create: 2022-10-15 23:09
 **/
public class ConcurrentHashMap_ {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        // synchronized ()
    }
}