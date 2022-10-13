package com.day02;

/**
 * @program: JAVA
 * 描述：
 *      斐波那契数列
 * @author: fzn
 * @create: 2020-07-21 09:46
 **/
public class DDemo {
    public static void main(String[] args) {
        /*
        * 有一组数据，按下面的规范，求第40位是多少
        * 1 1 2 3 5 8 13 21
        *第一位+第二位=第三位
        *  */
        int re = sh(20);
        System.out.println(re);
    }
    //i是第几位数
    public static int sh(int i){
        if (i<=0){
            return 0;
        }else if (i>0 && i<2){
            return 1;
        }else {
            return sh(i-1)+sh(i-2);
        }
    }
}
