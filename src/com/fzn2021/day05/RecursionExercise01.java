package com.fzn2021.day05;

/**
 * @program: JavaSE
 * 描述：          递归问题
 *      斐波那契数  和   猴子吃桃
 * @author: fzn
 * @create: 2021-12-11 17:32
 **/
public class RecursionExercise01 {
    public static void main(String[] args) {
        Arr arr = new Arr();
        // 斐波那契数
        System.out.println(arr.fibonacci(9));
        // 猴子吃桃
        System.out.println(arr.peach(1));
    }
}

class Arr{
    /*
    请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多
    思路分析
    1. 当n = 1 斐波那契数是1
    2. 当n = 2 斐波那契数是1
    3. 当n >= 3 斐波那契数是前两个数的和
    4. 这里就是一个递归的思路
    */
    public int fibonacci(int n) {
        if( n >= 1) {
            if( n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        } else {
            System.out.println("要求输入的n>=1 的整数");
            return -1;
        }
    }

    /*
        猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
        以后每天猴子都吃其中的一半，然后再多吃一个。当到第10 天时，
        想再吃时（即还没吃），发现只有1 个桃子了。问题：最初共多少个桃子？
        思路分析逆推
        1. day = 10 时有1 个桃子
        2. day = 9 时有(day10 + 1) * 2 = 4
        3. day = 8 时有(day9 + 1) * 2 = 10
        4. 规律就是前一天的桃子= (后一天的桃子+ 1) *2//就是我们的能力
        5. 递归
    */
    public int peach(int day) {
        if(day == 10) {//第10 天，只有1 个桃
            return 1;
        } else if ( day >= 1 && day <=9 ) {
            return (peach(day + 1) + 1) * 2;//规则，自己要想
        } else {
            System.out.println("day 在1-10");
            return -1;
        }
    }
}