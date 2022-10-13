package com.day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 10:55
 **/
public class ListDemo {
    public static void main(String[] args) {
       // Collection co = new Collection(); Collection  是接口
        //List li = new List();     List也是接口
        List li = new ArrayList();//多态
        //目前ArrayList,没有定义数据类型
        li.add("sun");//add增加元素 各种类型都能增加
        //li.add(1001);
        //li.add(true);
        li.add("aun");
        li.add("cun");
        System.out.println(li.size());//长度
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
        //判断是否为空
        System.out.println(li.isEmpty());
        //删除时通过下标删除
        li.remove(0);
        //修改元素
        li.add(0,"hs");//在下标0增加 元素
        li.set(1,"xcs");
        System.out.println(li);
        System.out.println("-------------");
        //目前li中的类型，没有控制，开发时，规范类型
        //泛型：进一步规范类型 用法<类的类型>
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(4);
        //加强for循环，满足1 集合 2有类型  快捷键iter
        for (Integer a:arr) {//把arr集合，遍历成每一个a
            System.out.println(a);
        }
        System.out.println("----------");
        System.out.println(arr);
    }
}

