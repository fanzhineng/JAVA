package com.fzn2022.day03.list_.vector_;

import java.util.Vector;

/**
 * @program: JAVA
 * 描述：  Vector底层结构和源码解析
 *              1. 底层也是一个动态数组   protected Object[] elementData;
 *              2.  Vector<E>extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 *              3. 是线程同步的，级线程安全 Vector类的操作方法都带有 synchronized
 *              4.  在开发中 需要线程安全时 考虑使用
 *
 *           源码解读
 *                 1. 无参 new Vector() 底层调用的是this(10) 默认大小10 满后就按照两倍扩容
 *                 2. 有参 、
 *                      new Vector(8); 则每次扩容按照2倍扩容
 *                      new Vector(8,2); 指定 capacityIncrement 增长容量 则按照增强的方式去扩容
 *               底层是三目运算 判断增长容量是否大于0
 *                  ((capacityIncrement > 0) ?capacityIncrement : oldCapacity);
 *
 * @author: fzn
 * @create: 2022-10-14 18:00
 **/
@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {
        // Vector
        //无参构造器  this(10)
        //有参数的构造
        Vector vector = new Vector(8,2);
        for (int i = 0; i < 10; i++) {
            vector.add(i);

        }
        vector.add(100);
        System.out.println("vector=" + vector);

        //读源码
        //1. new Vector() 底层
        /*
            public Vector() {
                this(10);
            }
        补充：如果是 Vector vector = new Vector(8);
        走的方法:
            public Vector(int initialCapacity) {
                this(initialCapacity, 0);
            }
        2. vector.add(i)
        2.1 //下面这个方法就添加数据到 vector 集合
            public synchronized boolean add(E e) {
                modCount++;
                ensureCapacityHelper(elementCount + 1);
                elementData[elementCount++] = e;
                return true;
            }
        2.2 //确定是否需要扩容 条件 ： minCapacity - elementData.length>0
            private void ensureCapacityHelper(int minCapacity) {
                // overflow-conscious code
                if (minCapacity - elementData.length > 0)
                grow(minCapacity);
            }
        2.3 //如果 需要的数组大小 不够用，就扩容 , 扩容的算法
            //newCapacity = oldCapacity + ((capacityIncrement > 0) ?
            // capacityIncrement : oldCapacity);
            //就是扩容两倍.
                private void grow(int minCapacity) {
                    // overflow-conscious code
                    int oldCapacity = elementData.length;
                    int newCapacity = oldCapacity + ((capacityIncrement > 0) ?capacityIncrement : oldCapacity);
                    if (newCapacity - minCapacity < 0)
                        newCapacity = minCapacity;
                    if (newCapacity - MAX_ARRAY_SIZE > 0)
                        newCapacity = hugeCapacity(minCapacity);
                    elementData = Arrays.copyOf(elementData, newCapacity);
                }
        */
    }
}