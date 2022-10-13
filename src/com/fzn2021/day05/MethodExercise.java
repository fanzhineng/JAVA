package com.fzn2021.day05;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-11 14:58
 **/
public class MethodExercise {
    public static void main(String[] args) {
        System.out.println(isEven(20));
    }

    /**
     * 判断是否是偶数还是奇数
     * @param x 参数
     * @return
     */
    public static boolean isEven(int x){
        return x%2==0;
    }
}