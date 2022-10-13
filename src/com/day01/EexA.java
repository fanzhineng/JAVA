package com.day01;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-20 18:25
 **/
public class EexA {
    public static void main(String[] args) {
        /*
         * 有36个物品，有36个人，
         * 人中有成年男，成年女，未成年小孩。
         * 成年男每次运四个物品，成年女每次运3个，
         * 二个小孩运一个，如果所有人都运，一运可运完。
         * 问，各有多少人.
         */
        for (int i=1;i<=9;i++){
            for (int j = 1;j<=12;j++){
                int k = 36-i-j;
                if (i*4+j*3+k/2==36 && k%2==0){
                    System.out.println("成年男："+i+"人 成年女："+j+"人 小孩："+k+"人");
                }
            }
        }
    }
}
