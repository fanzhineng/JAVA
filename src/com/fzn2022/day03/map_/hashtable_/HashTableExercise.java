package com.fzn2022.day03.map_.hashtable_;

import java.util.Hashtable;

/**
 * @program: JAVA
 * 描述：  HashTable 源码解读
 *      结构
 *          1. 存放的是键值对 kv
 *          2. 键和值都不能为null 否则NullPointerException
 *          3. 使用方法和HashMap一样
 *          4. 是线程安全的 hashMap是线程不安全的
 *      源码解读
 *             底层有数组 Hashtable$Entry[] 初始化大小为 11 临界值 11*0.75    加载因子 0.75
 *            扩容： 按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容.
 *                  2倍+1

 * @author: fzn
 * @create: 2022-10-15 13:09
 **/
@SuppressWarnings({"all"})
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();//ok
        table.put("john", 100); //ok
        //table.put(null, 100); //异常 NullPointerException
        //table.put("john", null);//异常 NullPointerException
        table.put("lucy", 100);//ok
        table.put("lic", 100);//ok
        table.put("lic", 88);//替换
        table.put("hello1", 1);
        table.put("hello2", 1);
        table.put("hello3", 1);
        table.put("hello4", 1);
        table.put("hello5", 1);
        table.put("hello6", 1);
        System.out.println(table);

        //简单说明一下Hashtable的底层
        //1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
        //2. 临界值 threshold 8 = 11 * 0.75
        //3. 扩容: 按照自己的扩容机制来进行即可.
        //4. 执行 方法 addEntry(hash, key, value, index); 添加K-V 封装到Entry
        //5. 当 if (count >= threshold) 满足时，就进行扩容
        //5. 按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容.

    }
}
