package com.fzn2022.day03.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @program: JAVA
 * 描述：      TreeSet 底层就是 TreeMap  底层实现是红黑树 默认有序
 * @author: fzn
 * @create: 2022-10-15 17:10
 **/
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        //1. 当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
        //2. 希望添加的元素，按照字符串大小来排序
        //3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
        // 并指定排序规则
        //4. 简单看看源码

        /*
            1. 构造器把传入的比较器对象，赋给了 TreeSet 的底层的 TreeMap 的属性 this.comparator
            public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
            }
            2. 在 调用 treeSet.add("tom"), 在底层会执行到
                if (cpr != null) {//cpr 就是我们的匿名内部类(对象)
                do {
                parent = t;
                //动态绑定到我们的匿名内部类(对象)compare
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                t = t.left;
                else if (cmp > 0)
                t = t.right;
                else //如果相等，即返回 0,这个 Key 就没有加入
                return t.setValue(value);
                } while (t != null);
                }
            */

        // TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用 String 的 compareTo 方法进行字符串大小比较
                // return ((String) o2).compareTo((String) o1);
                //如果求加入的元素，按照长度大小排序
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc"); // 加入不进去 因为比较规则

        System.out.println("TreeSet=" + treeSet);
    }
}