package com.day08;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-30 17:04
 **/
public class Exef {
    public static void main(String[] args) throws Exception {
        int re = add();
        System.out.println(re);

    }
    public static int[] getIn(){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        try {
            nums[0] = sc.nextInt();
            nums[1] = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            throw e;//把异常对象传递给链化的方法中
        }finally {
            System.out.println("finally");
        }
        return nums;
    }
    public static int add() throws Exception {
        int re = 0;
        try {
            int[] arr = getIn();
            re = arr[0] + arr[1];
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception("add 异常");
        }
        return re;
    }
}
