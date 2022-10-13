package com.fzn2020.day06;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @program: JAVA
 * 描述：Math类
 * @author: fzn
 * @create: 2020-07-28 15:47
 **/
public class MathDemo {
    public static void main(String[] args) {
        //绝对值 abs
        System.out.println(Math.abs(-2));
        //向上取整 ceil
        System.out.println(Math.ceil(12.3f));
        //向下取整 floor
        System.out.println(Math.floor(12.3f));
        //0~1之间的随机小数 到不了1  random随机数
        System.out.println(Math.random());
        //取两位小数
        double d = 3.1416d;
        System.out.println(Math.floor(d*100)/100);
        //类 DecimalFormat数字格式化类 第三位是四舍五入
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(d));
        //随机数的类
        Random rd = new Random();
        System.out.println( rd.nextInt(52));;//0~51
        //pow 幂
        System.out.println(Math.pow(2,3));
        //sqrt 开方
        System.out.println(Math.sqrt(64));
        //最大值 max 最小值  只能放两个值
        int a = 13;
        int b = 14;
        int c = 5;
        int f =6;
        System.out.println(Math.max(Math.max(a,b),Math.max(c,f)));

    }
}
