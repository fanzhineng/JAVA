package com.fzn2022.day03.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @program: JAVA
 * 描述：  HashSet底层实现原理
 *          get()
 *              1. 底层是HashMap
 *              2. 添加一个元素时, 先得到hash值--会转成->索引值
 *              3. 找到存储数据表table, 看这个索引位置是否已经存放的有元素
 *              4. 如果没有,直接加入
 *              5. 如果有的话，调用equals方法比较链表所有的元素， 如果不相同，则添加到最后
 *                      如果相同的话，因为HashSet底层是HashMap
 *                      他的值就是HashMap的key，而value则是一个固定的Object对象。
 *                      在这，相当于key相同，value也相同（都是Object对象） 所以不会进行替换 从而放弃添加
 *              6. 在Java8中 如果一条链表的元素个数达到（超过）  TREEIFY_CAPACITY(默认是8)
 *                 并且table的大小 >= MIN_TREEIFY_CAPACITY(默认64) 就会进行树化(红黑数)
 *
 *          1. HashSet底层是HashMap 第一次添加时，table数组扩容到16 临界值（threshold）是16*加载因子
 *              （loadFactor）是0.75 = 12
 *          2.如果table数组使用了到临界值12 就会扩容到16*2=32 新的临界值是32 * 0.75 = 32
 *                  新的临界因子 32*0.75 = 24 依次类推
 *          3. 在Java8中 如果一条链表的元素个数达到（超过）  TREEIFY_CAPACITY(默认是8)
 *                并且table的大小 >= MIN_TREEIFY_CAPACITY(默认64) 就会进行树化(红黑数)
 *                 否则还是采用数组扩容机制
 * @author: fzn
 * @create: 2022-10-15 00:27
 **/
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set="+hashSet);

        /*
            HashSet 的源码解读
            1. 执行 HashSet()
                public HashSet() {
                    map = new HashMap<>();
                }
            2. 执行 add()
                public boolean add(E e) {//e = "java"
                    return map.put(e, PRESENT)==null;//(static) PRESENT = new Object();
                }
            3.执行 put() , 该方法会执行 hash(key) 得到 key 对应的 hash 值 算法 h = key.hashCode()) ^ (h >>> 16)
                public V put(K key, V value) {//key = "java" value = PRESENT 共享
                    return putVal(hash(key), key, value, false, true);
                }
            4.执行 putVal
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
                    Node<K,V>[] tab; Node<K,V> p; int n, i; //定义了辅助变量
                    //table 就是 HashMap 的一个数组，类型是 Node[]
                    //if 语句表示如果当前 table 是 null, 或者 大小=0
                    //就是第一次扩容，到 16 个空间. if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                    //(1)根据 key，得到 hash 去计算该 key 应该存放到 table 表的哪个索引位置
                    //并把这个位置的对象，赋给 p
                    //(2)判断 p 是否为 null
                    //(2.1) 如果 p 为 null, 表示还没有存放元素, 就创建一个 Node (key="java",value=PRESENT)
                    //(2.2) 就放在该位置 tab[i] = newNode(hash, key, value, null)
                    if ((p = tab[i = (n - 1) & hash]) == null)
                        tab[i] = newNode(hash, key, value, null);
                    else {
                        //一个开发技巧提示： 在需要局部变量(辅助变量)时候，在创建
                        Node<K,V> e; K k; //
                        //如果当前索引位置对应的链表的第一个元素和准备添加的 key 的 hash 值一样
                        //并且满足 下面两个条件之一:
                        //(1) 准备加入的 key 和 p 指向的 Node 结点的 key 是同一个对象
                        //(2) p 指向的 Node 结点的 key 的 equals() 和准备加入的 key 比较后相同
                        //就不能加入
                        if (p.hash == hash &&
                            ((k = p.key) == key || (key != null && key.equals(k))))
                            e = p;
                        //再判断 p 是不是一颗红黑树,
                        //如果是一颗红黑树，就调用 putTreeVal , 来进行添加
                        else if (p instanceof TreeNode)
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                        else {//如果 table 对应索引位置，已经是一个链表, 就使用 for 循环比较
                            //(1) 依次和该链表的每一个元素比较后，都不相同, 则加入到该链表的最后
                                //    注意在把元素添加到链表后，立即判断 该链表是否已经达到 8 个结点
                                //    , 就调用 treeifyBin() 对当前这个链表进行树化(转成红黑树)
                                //   注意，在转成红黑树时，要进行判断, 判断条件
                                //      if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY(64))
                                //          resize();
                                //   如果上面条件成立，先 table 扩容.
                                // 只有上面条件不成立时，才进行转成红黑树
                            //(2) 依次和该链表的每一个元素比较过程中，如果有相同情况,就直接 break
                            for (int binCount = 0; ; ++binCount) {
                                if ((e = p.next) == null) {
                                    p.next = newNode(hash, key, value, null);
                                    if (binCount >= TREEIFY_THRESHOLD(8) - 1) // -1 for 1st
                                        treeifyBin(tab, hash);
                                    break;
                                }
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;
                                p = e;
                            }
                        }
                        if (e != null) { // existing mapping for key
                            V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e); // 给子类继承 从写排序啥的 空方法
                        return oldValue;
                    }
                }
                ++modCount;
                //size 就是我们每加入一个结点 Node(k,v,h,next), size++
                if (++size > threshold)
                    resize();//扩容
                afterNodeInsertion(evict);
                return null;
            }
         */
    }
}