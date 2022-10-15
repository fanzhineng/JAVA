package com.fzn2022.day03.set_.hashset_;

import java.util.HashSet;

/**
 * @program: JAVA
 * 描述：      HashSet
 *                  1. HashSet 实现了Set接口
 *                  2. HashSet 实际就是HashMap
 *                  3. 可以存放null值 但是只有一个null
 *                  4. HashSet不保证元素有序的，取决于hash后 再确定索引的结果
 *                  4. 不能有重复元素/对象
 * @author: fzn
 * @create: 2022-10-14 23:11
 **/
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        /*
            1. HashSet 底层是HashMap
            public HashSet() {
                map = new HashMap<>();
            }
            2. HashSet 可以存放null 但是只能有一个null
         */
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet="+hashSet);

        //说明
        //1. 在执行 add 方法后，会返回一个 boolean 值
        //2. 如果添加成功，返回 true, 否则返回 false
        //3. 可以通过 remove 指定删除哪个对象
        System.out.println(hashSet.add("john"));//T
        System.out.println(hashSet.add("lucy"));//T
        System.out.println(hashSet.add("john"));//F
        System.out.println(hashSet.add("jack"));//T
        System.out.println(hashSet.add("Rose"));//T

        hashSet.remove("john");
        System.out.println("set=" + hashSet);//4 个

        System.out.println("------------");

        HashSet set = new HashSet();
        System.out.println("set=" + set);//0
        //4 Hashset 不能添加相同的元素/数据?
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了
        // 不是同一个对象
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//Ok
        System.out.println("set=" + set);

        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//加入不了.  String add底层会去判断内容是否相同
        System.out.println("set=" + set);
    }
}
class Dog { //定义了 Dog 类
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}