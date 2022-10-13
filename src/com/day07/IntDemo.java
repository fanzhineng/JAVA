package com.day07;

/**
 * @program: JAVA
 * 描述：      Integer int的包装类
 * @author: fzn
 * @create: 2020-07-29 16:04
 **/
public class IntDemo {
    public static void main(String[] args) {
        //把i给包装类
        //定义包装类时，可直接赋值
        Integer in = new Integer(101);
        System.out.println(in);
        //把Integer 转换成int类型 intValue
        int ia = in.intValue();
        int i =12;//字面量 直接赋值使用
        Integer i2 = i;//直接赋值
        System.out.println(i2);
        System.out.println(Integer.MAX_VALUE);//最大
        System.out.println(Integer.MIN_VALUE);//最小
        System.out.println(Integer.toHexString(i));//十六进制
        System.out.println("-------------------");
        //字符和整数类型相互转化
        String str = "123";
        int i3 = Integer.parseInt(str);
        System.out.println(i3);
        int m = 1234;
        String str2 = Integer.toString(m);
        System.out.println(str2);



    }

}



