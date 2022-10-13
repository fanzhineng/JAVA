package com.fzntest;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-26 21:02
 **/
public class Static {
    public static String name ="123";
    public static void main(String[] args) {
        Static.name = "456";
        System.out.println(Static.name);
        String s = null;
        System.out.println(s);
        //int len = s.length();//会报错，空指针异常。
        //解决方法
        if (s !=null){//判断是否为空
            int len = s.length();
        }
    }
}
