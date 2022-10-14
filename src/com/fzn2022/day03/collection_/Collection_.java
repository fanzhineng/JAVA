package com.fzn2022.day03.collection_;

import java.util.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2022-10-14 14:19
 **/
public class Collection_ {
    public static void main(String[] args) {
        /*
         * 1. 集合主要是两组 单列集合 双列集合
         * 2. Collection 接口哟u两个主要的子接口 List Set 他们的实现子类都是
         * 3. Map 接口的实现子类 是双列集合 存放的 K-V
         *
         */

        // list
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");

        // Map
        HashMap hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");
    }
}