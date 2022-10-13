package com.day11;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 14:57
 **/
public class ConCurDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> co = new ConcurrentHashMap<>();
        co.put(1,"aaa");
        co.put(3,"ccc");
        co.put(2,"bbb");
        System.out.println(co);
        System.out.println(co.size());
        System.out.println(co.get(1));
        System.out.println("-----------");
        //迭代器  得到所有的key     co.keySet() set类型   iterator()
        Iterator<Integer> it = co.keySet().iterator();
        while (it.hasNext()){
            //System.out.println(it.next());
            System.out.println(co.get(it.next()));;
        }
    }
}
