package com.day01;

/**
 * @program: JAVA
 * 描述：
 *         基本数据类型
 *              byte：占8位 01111111     -128~127
 *              short：占16位    -32768~32767
 *              int ：占32位     -2147483648~2147483647
 *              long： 占64位
 *              float ：占32位
 *              double： 占64位
 *              char：一个字符
 *              boolean：判断类型 只有真假 true false
 *         类型之间的转换
 *
 * @author: fzn
 * @create: 2020-07-20 09:54
 **/
public class ADemo {
    public static void main(String[] args) {
        //Integer 整数的包装类
        int i = 27;//十进制
        //转换成二进制
        System.out.println(Integer.toBinaryString(i));
        //转换成八进制
        System.out.println(Integer.toOctalString(i));
        //装换成十六进制
        System.out.println(Integer.toHexString(i));
        //八进制
        int b= 045;
        //16进制
        int c= 0xa12;
        //各种进制转换为二进制
        System.out.println(Integer.valueOf("0125",8).toString());
        //byte 占8位 第一位是符号位 01111111
        byte by = 126;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short sh = 230;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        int in = 655544;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //类型的转换
        //已知小类型整数，给大类型  自动类型转换
        byte b4 = 120;
        short s4;
        s4=b4;
        System.out.println(s4);
        //已知大类型整数，给小类型  强制类型转换
        short s5 = 119;
        byte by5;
        by5=(byte)(s5);
        System.out.println(by5);//如果超出范围会溢出，值是不对的

        //long 已L结尾 默认识别是int
        long lo = 545454L;
        //小数，float(32) 单精度表示法，符号位占1位，用来表示正数还是负数
        //指数位8位，后面数字放到小数位中23位。存储空间是远大于int
        float f = 324.0f;//已f结尾
        //double(64) 双精度 符号位占一位 指数位11位，小数位占52位。
        //指数位决定存储空间的大小
        double d = 2322323.00d;//已d结尾
        //开发时，整数默认是int,小数默认用float
        //char 指的是一个字符，Unicode码
        //也是二进制 通过''引入 字符串是通过""
        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);
        //已知一个字符，得到对应的Unicode码
        char ch3 ='中';
        System.out.println(ch3-0);//ch3-0就能得到对应的Unicode码
        //已知一个Unicode码，得到其字符
        char ch4 =66;
        System.out.println(ch4);

        //boolean 布尔类型
        //假设真的下雨
        boolean rain = true;
        if (rain){
            System.out.println("今天下雨");
        }else {
            System.out.println("今天不下雨");
        }
    }
}
