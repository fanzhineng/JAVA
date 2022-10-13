package com.fzn2020.day03;

import javax.sound.midi.Soundbank;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-22 14:42
 **/
//在同一个包下，class名也要唯一。
public class AddDemo {
    public static void main(String[] args) {
        /*
        int[] ary = new int[]{11,12,13,14};
        Pa p =new Pa();
        int re = p.add(ary);
        System.out.println(re);
        System.out.println("------");
        int re2 = p.add(3);
        System.out.println(re2);*/
        int a=1;
        Pa p = new Pa();
        int b =p.add(a);
        System.out.println(a);//1
        System.out.println(b);//2
        System.out.println("--------");

        Ka k = new Ka();
        p.add(k);
        System.out.println(k.a);//2
        System.out.println("--------");

        int[] ary = new int[]{1,2,3};
        p.add(ary);
        System.out.println(ary[0]);//2
        //如果是对象中的属性值和数组元素中的属性值，因为在堆中，改变了，不需要返回值也是改变了。
        //如果是栈中的属性值，因为在栈中，改变了，如果没有返回值，还是没有改变。
    }

}
//类 只有new才能使用
class Ka{
    int a=1;
}
class Pa{
    public int add(int[] ary){
        return ++ary[0];//数组的第一个元素增加
    }
    public int add(int a){
        return ++a;
    }
    public int add(Ka k){
        return ++k.a;
    }
}
