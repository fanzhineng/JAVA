package com.fzn2022.day03.set_.hashset_;

/**
 * @program: JAVA
 * 描述：  HashSetStructure 底层机制说明
 *              HashMap底层是 数组+链表+红黑树
 * @author: fzn
 * @create: 2022-10-14 23:51
 **/
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟HashSet的底层 (HashMap底层)

        // 1. 创建一个数组  数组的类型是Node[]
        // 2. 有一些人 直接把Node数组称为table表
        Node[] table = new Node[16];
        System.out.println("table"+table);

        // 3. 创建结点
        Node join = new Node("join", null);
        table[2] = join;
        Node jack = new Node("jack", null);
        join.next = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table"+table);
    }
}
// 结点 存储数据 可以指向下一个节点 从而形成链表
class Node {
    /**
     * 存放数据
     */
    Object item;
    /**
     * 指向下一结点
     */
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

}