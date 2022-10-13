package com.fzn2020.day05;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 * 新建一个类，通过自定义方法和数组，发出6个数字不同的双色球出来。
 *     (数字范围在0..30)
 * @author: fzn
 * @create: 2020-07-27 10:16
 **/
public class ExeDemo {
    public static void main(String[] args) {
        ExeDemo exeDemo = new ExeDemo();
        int[] ary = exeDemo.getNum();
        System.out.println(Arrays.toString(ary));

    }
    //得到随机的数
    public int[] getNum(){
        boolean[] bo = new boolean[31];//先发很多数 默认为false 目的是把所有的数给一个标记 如果为true说明出现过一次
        //数组
        int[] num = new int[6];
        int i=0;//控制下标
        while (true){
            int rd =(int)(Math.random()*31);//0~30
            //标记下标
            if (bo[rd]){//如果为true 就出现过
                continue;
            }
            bo[rd]=true;//第一次出现
            num[i++]=rd;//存入
            if (i==6){//数组满了
                break;
            }
        }
        return num;
    }
}
