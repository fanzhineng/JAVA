package com.fzn2022.day03.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: JAVA
 * 描述：      Set
 *              1. 无序（添加和取出的顺序不一致） 没有索引
 *              2. 不允许重复元素 所以最多包含一个null
 *              3. JDK API中Set接口的实现类有：
 *                      HashSet     TreeSet     LinkedHashSet
 *             和 List 接口一样, Set 接口也是 Collection 的子接口，因此，常用方法和 Collection 接口一样.
 *
 *             遍历方式
 *                 1. 迭代器遍历
 *                 2. 增强for
 *                 3. 不能使用for循 索引的方式遍历 因为没有索引
 * @author: fzn
 * @create: 2022-10-14 22:57
 * 常用方法
 **/
@SuppressWarnings({"all"})
public class Set_ {
    public static void main(String[] args) {
        //1. 以 Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        //2. set 接口的实现类的对象(Set 接口对象), 不能存放重复的元素, 可以添加一个 null
        //3. set 接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)  但是取出的顺序是固定的（底层有一个算法 数组加链表）
        //4. 注意：取出的顺序的顺序虽然不是添加的顺序，但是他的固定.
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(null);//再次添加 null
        for(int i = 0; i <10;i ++) {
            System.out.println("set=" + set);
        }

        //遍历
        //方式 1： 使用迭代器
        System.out.println("=====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        set.remove(null);

        //方式 2: 增强 for
        System.out.println("=====增强 for====");
        for (Object o : set) {
            System.out.println("o=" + o);
        }
    }
}