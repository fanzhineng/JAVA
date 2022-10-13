package com.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: JAVA
 * 描述：
 *          Map ->HashMap
 * @author: fzn
 * @create: 2020-08-03 16:53
 **/
public class MapDemo {
    public static void main(String[] args) {
        //异或：从高位开始比 相同为0 不同为1 8^10==3
        //8 :1000 ,11:1011,8^11=3(011)
        Map<Integer,String> m =new HashMap<>();
        System.out.println(m.size());//长度
        System.out.println(m.isEmpty());//是否为空
        //赋值
        m.put(1,"美食区");
        m.put(2,"讨论区");
        m.put(3,"积分区");
        m.put(4,"电影区");
        System.out.println(m.size());
        //取值 通过key来取值
        System.out.println(m.get(1));
        System.out.println(m.get(7));//没有为null
        //修改值
        m.put(1,"美食新区");
        System.out.println(m.get(1));
        //通过key 来删除
        m.remove(4);
        System.out.println(m.get(4));
        System.out.println("--------");
        //遍历
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i+1));
        }
        System.out.println("----------");
        //判断是否含有某一个值
        System.out.println(m.containsKey(1));
        //清空
        //m.clear();
        System.out.println(m.size());//0
        System.out.println("----------");
        //把map中所有的key取出来
        Set<Integer> se = m.keySet();
        for (Integer s : se) {
            System.out.println(s);//s取key
            System.out.println(m.get(s));//取value
        }
        System.out.println("-------------");
        //用迭代器的思路
        //Map.Entry<Integer,String> map中的每一组元素 都是key value
        Set<Map.Entry<Integer,String>> ma = m.entrySet();
        Iterator it = ma.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//it.next()每一个map
        }
        System.out.println("-------------");
        //连起来写
        Iterator<Map.Entry<Integer,String>> itx = m.entrySet().iterator();
        while (itx.hasNext()){
            System.out.println(itx.next().getKey());//得到key
        }

    }
}
