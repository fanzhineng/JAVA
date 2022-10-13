package com.day08;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      自己新建文件，完成输入三个数，输入时，要做异常处理，
 *      再通过另一方法得到最大值。此时要用到异常的链化 。
 * @author: fzn
 * @create: 2020-07-30 19:14
 **/
public class ExeCDemo {
    public static void main(String[] args) throws InputMismatchException{
            int max =  getMax();
            System.out.println("最大值是："+max);
    }
    //得到最大
    public static int getMax() throws InputMismatchException{
        int t =0;
        try {
            int[] ary = gets();
            t =ary[0];//假设a是最大
            if (ary[1]>t){
                t = ary[1];
            }
            if (ary[2]>t){
                t = ary[2];
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            throw new InputMismatchException("getMax 异常");
        }
        return t;
    }
    //得到数
    private static int[] gets() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        try {
            nums[0] = sc.nextInt();
            nums[1] = sc.nextInt();
            nums[2] = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            throw e;//把异常对象传递给链化的方法中
        }
        return nums;
    }
}
