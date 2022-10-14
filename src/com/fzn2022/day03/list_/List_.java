package com.fzn2022.day03.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2022-10-14 16:10
 **/
public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // 1. List集合类中有序(即添加顺序和取出顺序一致)、且重复[案例]
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("fzn");
        list.add("fzn");
        System.out.println(list);
        // 2. List集合中的每一个元素都有对应的顺序索引 即支持索引
        System.out.println(list.get(3));
    }
}