package com.fzn2022.day03.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: JAVA
 * 描述：  Map接口常用方法
 *             1. Map（双列集合）与Collection（单列集合）并列存在 用于保存具有映射关系的数据：Key-Value
 *             2. Map中的key 和value 可以是任何的引用类型的数据 会封装到HashMap$Node对象中
 *             3. Map中的key不允许重复 value可以重复
 *             4. Map的key可以null 但是只能有一个  value可以为null 可以有多个
 *             5. 常用String类为Map的key
 *             6. key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value
 * @author: fzn
 * @create: 2022-10-15 12:23
 **/
@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","fzn");
        map.put("no2","lzx");
        map.put("no1","lf"); // 替换掉fzn 相同的key会替换
        map.put("no3","lf");
        System.out.println(map);

        Integer a = new Integer(56);
        Integer b = new Integer(56);
        Integer c = 56;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==c);
    }
}