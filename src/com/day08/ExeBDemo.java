package com.day08;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *          4 新建一个类，可输入很多整数，要含重复的，
 *          用到数组，循环，得到重复的元素，并用到异常处理。
 *          比如 输入 1 1 2 2 3 4 5 重复的元素是1 2
 * @author: fzn
 * @create: 2020-07-30 18:34
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("请问你要输入几个数");
        try {
            int num = sc.nextInt();
            //调用
            get(num);
        } catch (InputMismatchException e) {
            System.out.println("请输入整型！");
        }
    }
    //得到重复数组中的元素 相当与去掉没有重复的。
    public static void get(int num){
        int[] ary = new int[num];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入"+num+"个数字:");
            for (int i=0;i<ary.length;i++){
                try {
                    ary[i]= sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("请输入整数！");
                    System.exit(0);//程序退出
                }
            }
        Arrays.sort(ary);//排序
        //定义一个新数组 然后把重复出现的值一个的放到新数组中
        int[] reAry = {};
        //遍历数组
        int co;
        for (int i = 0; i < ary.length; i++) {// 1 1 2 3
            co=0;//初始化值
            for (int j=i+1;j<ary.length;j++){
                if (ary[i]==ary[j]){
                    co++;
                }
            }
            if (co>0){
                //长度加一
                reAry = Arrays.copyOf(reAry,reAry.length+1);
                reAry[reAry.length-1]=ary[i+co];
                i = i+co;//用来跳过已经重复的循环
            }
        }
        System.out.println("重复出现的元素组成的新数组："+Arrays.toString(reAry));
    }
}
