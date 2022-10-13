package com.fzn2021.day15.map_;

import java.util.Properties;

/**
 * @program: JavaSE
 * 描述：
 *  properties 也是k-v
 *  当然key 和value不能为null
 *  key 和 value 不能为空
 *  如果有想的key 也会替换值
 * @author: fzn
 * @create: 2022-01-11 18:51
 **/
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);

        System.out.println(properties);

        // 通过k 获取对应的值
        System.out.println(properties.get("lic"));
        // 删除元素
        properties.remove("lucy");
        System.out.println(properties);

    }
}