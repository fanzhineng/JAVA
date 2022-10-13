package com.day09;

import java.util.ArrayList;

/**
 * @program: JAVA
 * 描述：
 *      删除重复的，留下不重复的。
 * @author: fzn
 * @create: 2020-07-31 15:21
 **/
public class List4Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);//得到
            /*
            for (int j = i+1; j < arr.size(); j++) {
                if (num == arr.get(j)){
                   arr.remove(j);
                   j--;
                }
            }
             */
            /*
            for (int j = i+1; j < arr.size();) {
                if (num == arr.get(j)){
                    arr.remove(j);
                }else {
                    j++;
                }
            }
             */
            for (int j = arr.size()-1; j >i; j--) {
                if (arr.get(j)==num){
                    arr.remove(j);
                }
            }
        }

        /*
            集合：如果增加元素，此处有元素，此元素和后面的都会后走一位。
            如果是删除的话，会向前走一位
         */
        System.out.println(arr);

    }
}
