package com.fzn2022.day03.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: JAVA
 * 描述：  map 源码解读
 * @author: fzn
 * @create: 2022-10-15 13:09
 **/
@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","fzn");
        map.put("no2","lzx");

        System.out.println(map);
        // 源码解读
        /*
            1. k-v 最后是 HashMap$Node node  =  newNode(hash, key, value, null);
            2. k-v 为了方便程序员遍历 还会创建 EntrySet 集合 ， 该集合存放的元素类型就是 Entry
                而一个Entry对象就有k,v   EntrySet<Entry<K,V>> 即 transient Set<Map.Entry<K,V>> entrySet;
            3. entrySet中定义的类型是 Map.Entry 但是实际上存放的还是 HashMap$Node
                   这是因为 HashMap$Node 实现了 Map.Entry
                   static class Node<K,V> implements Map.Entry<K,V>
            4. 当把 HashMap$Node 对象存放到 entrySet 就方便我们的遍历
                    因为 Map.Entry<K,V> 提供了 entry.getKey();  entry.getValue() 方法
         */
        Set set = map.entrySet();
        System.out.println(set.getClass()); // HashMap$EntrySet

        for (Object obj : set) {
            // System.out.println(obj.getClass()); // HashMap$Node 运行类型还是node
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-"+entry.getValue());
        }
        // 得到所有的Key
        Set set1 = map.keySet();
        System.out.println(set1.getClass()); // HashMap$KeySet 内部类
        // 得到所有value
        Collection values = map.values();
        System.out.println(values.getClass()); // HashMap$Values
    }
}