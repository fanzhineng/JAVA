package com.fzn2022.day03.list_.linkedlist_;

import java.util.LinkedList;

/**
 * @program: JAVA
 * 描述：      LinkedList 的全面说明
 *              1. 底层是实现了双向链表和双端队列特点
 *              2. 可以添加任意元素（元素可以重复） 包括null
 *              3. 线程不安全，没有实现同步
 *            LinkedList 的底层操作机制
 *              1. 底层维护了一个双向链表
 *              2. 维护了两个属性first和last分别指向 首节点和尾节点
 *              3. 每个节点（Node对象) 里面有维护prev next item 三个属性，其中通过
 *                  prev指向前一个，通过next指向后一个节点。最终实现双向链表
 *              4. 所以LinkedList的元素的添加和删除，不是通过数组完成的，相当来说效率较高
 *              5. 模拟一个简单的双向链表
 * @author: fzn
 * @create: 2022-10-14 18:22
 **/
public class LinkedList_ {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node fzn = new Node("fzn");

        // 连接三个节点 形成双向链表
        jack.next = tom;
        tom.next = fzn;
        fzn.prev = tom;
        tom.prev = jack;

        // 头结点
        Node first = jack;
        // 尾节点
        Node  last = fzn;

        // 从头到尾遍历
        System.out.println("=====从头到尾遍历=====");
        while (true) {
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;

        }

        // 从尾到头遍历
        System.out.println("=====从尾到头遍历=====");
        while (true) {
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.prev;

        }


        // 插入对象 tom  fzn 之间 插入smith
        Node smith = new Node("smith");
        smith.next = fzn;
        smith.prev = tom;
        fzn.prev = smith;
        tom.next = smith;

        // 重新指向头部 因为已经指向到尾部了
        first = jack;
        // 从头到尾遍历
        System.out.println("=====从头到尾遍历=====");
        while (true) {
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;

        }
    }
}

// 定义一个Node 类 Node对象 表示双向链表的一个节点
class Node {
    /**
     *存放数据对象
     */
    public Object item;
    /**
     * 指向上一个节点
     */
    public Node prev;
    /**
     * 指向下一个节点
     */
    public Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name=" +item;
    }
}