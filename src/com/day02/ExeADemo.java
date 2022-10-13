package com.day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-21 18:39
 **/
public class ExeADemo {
    /*
    * 新建一个exe.java，可输入字符串，内含有重复的a。
    * 得到a的下标，并把下标放入新的数组
    * */
    public static void main(String[] args) {
        //创建Scanner对象。
        Scanner sc = new Scanner(System.in);
        //接收用户输入
        System.out.print("请输入一串字符:");
        String str = sc.next();
        //定义一个空数组
        int[] arr = {};
        //遍历字符串
        for (int i=0;i<str.length();i++){
            //取到每一个字符
            char ch = str.charAt(i);
            if(ch=='a'){
                //让数组的长度加一
                arr= Arrays.copyOf(arr,arr.length+1);
                //把下标放入新数组中，arr.length-1保证每次都是在最后一个位置。
                arr[arr.length-1] = i;
            }
        }
        //打印新数组
        System.out.println(Arrays.toString(arr));
    }
}
