package com.fzn2022.day03.map_.hashtable_;

import java.util.Properties;

/**
 * @program: JAVA
 * 描述：      Properties
 *                 1. 继承自 HashTable 并且实现了Map接口 也是使用一种键值保存数据
 *                 2. 用于配置文件的
 * @author: fzn
 * @create: 2022-10-15 15:42
 **/
@SuppressWarnings({"all"})
public class  Properties_{
    public static void main(String[] args) {

        //1. Properties 继承  Hashtable
        //2. 可以通过 k-v 存放数据，当然key 和 value 不能为 null
        //增加
        Properties properties = new Properties();
        //properties.put(null, "abc");//抛出 空指针异常
        //properties.put("abc", null); //抛出 空指针异常
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//如果有相同的key ， value被替换

        System.out.println("properties=" + properties);

        //通过k 获取对应值
        System.out.println(properties.get("lic"));//88

        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);

        //修改
        properties.put("john", "约翰");
        System.out.println("properties=" + properties);

    }
}