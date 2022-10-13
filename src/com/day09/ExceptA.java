package com.day09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 09:56
 **/
public class ExceptA {
    public static void main(String[] args) throws Exception{
        mu();
    }
    //传入两个数A， 用减法得到结果B
    //输入
    public static int[] getIn(){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        try {
            nums[0] = sc.nextInt();
            nums[1] = sc.nextInt();
        }catch (InputMismatchException e){
            throw e;//抛出异常，抛给调用方
        }
        return nums;
    }
    //减法
    public static int mu() throws Exception{
        int re;
        try {
            int[] nums = getIn();//有风险。
            re = nums[0] - nums[1];
        } catch (InputMismatchException e) {
            throw new Exception("我是mu中的异常");
        }
        return re;
    }
}

