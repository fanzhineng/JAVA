package com.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 16:12
 **/
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("sun");
        arr.add("hu");
        arr.add("xi");
        //增加元素到集合的后面
        Collections.addAll(arr,"aa","bb","cc");
        System.out.println(arr);
        System.out.println("---------");
        //排序 如果是字母按照首字母序 如果是数字 按数值
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("---------");
        //如果是数值
        List<Integer> ar2 = new ArrayList<>();
        ar2.add(11);
        ar2.add(2);
        ar2.add(121);
        ar2.add(123);
        System.out.println(ar2);
        System.out.println("---------");
        //数值排序
        Collections.sort(ar2);
        System.out.println(ar2);
        System.out.println("---------");
        //反转
        Collections.reverse(ar2);
        System.out.println(ar2);
        System.out.println("---------");
        //打乱    shuffle
        Collections.shuffle(ar2);
        System.out.println(ar2);
        System.out.println("---------");
        //替换    replaceAll
        Collections.replaceAll(ar2,131,157);
        System.out.println(ar2);
        System.out.println("---------");
        //查元素的位置，先要排序，再查    如果不排序就会有问题
        Collections.sort(ar2);
        System.out.println( Collections.binarySearch(ar2,11));;
        //填充    把集合种的所有元素变成34 替换所有元素
        Collections.fill(ar2,34);
        System.out.println(ar2);
    }
}
