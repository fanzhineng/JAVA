package com.day02;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 *      数组的合并
 * @author: fzn
 * @create: 2020-07-21 11:35
 **/
public class Ary2Demo {
    public static void main(String[] args) {
        int[] ary1 = new int[]{11,12,13,14,15};
        int[] ary2 = new int[]{22,23,24,25,27};
        //先定义一个新数组长度，ary1.length+ary2.length
        int[] ary3 = new int[ary1.length+ary2.length];
        //数组元素的复制
        /*
        * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        * 将指定源数组中的数组从指定位置复制到目标数组的指定位置。
        * 1.要操作的数组
        * 2.要操作的数组的元素下标
        * 3.目标数组
        * 4.放到目标数组中的哪个位置
        * 5.要操作的数组的长度
        * */
        System.arraycopy(ary1,0,ary3,0,ary1.length);
        System.arraycopy(ary2,0,ary3,ary1.length,ary2.length);
        System.out.println(Arrays.toString(ary3));

    }
}
