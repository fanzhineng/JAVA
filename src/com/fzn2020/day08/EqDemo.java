package com.fzn2020.day08;

/**
 * @program: JAVA
 * 描述：
 *          比较== 和equals 的区别
 * @author: fzn
 * @create: 2020-07-30 10:05
 **/
public class EqDemo {
    public static void main(String[] args) {
        int a =12;
        int b =12;
        if (a ==b){
            System.out.println("相同的值");
        }else {
            System.out.println("不相同的值");
        }
        //包装类
        Integer i1 = new Integer(120);
        Integer i2 = new Integer(120);
        System.out.println(i1 == i2);//f
        System.out.println(i1.equals(i2));//t
        System.out.println("-----------");
        //字符串
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);//t
        System.out.println(str1.equals(str2));//t
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);//f
        System.out.println(str3.equals(str4));//t
        System.out.println("------------------------");
        //new出来的内容
        UserA A = new UserA(101,"sun");
        UserA B = new UserA(101,"sun");
        System.out.println(A == B);//f
        //equals是Object提供的方法，比较的也是地址值。
        System.out.println(A.equals(B));//没有重写前为false 重写之后为true
        /*
            重写equals之后 AB 里面内容相同
         */
        //hashCode()
        System.out.println(A.hashCode());
        System.out.println(B.hashCode());

    }
}
