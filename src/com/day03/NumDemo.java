package com.day03;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：比较
 *      自定义一个类，数字 NumDemo，有加法，减法等，
 *      自己定义方法，要有三个重载的方法，并能按输入，输出结果.
 * @author: fzn
 * @create: 2020-07-22 17:36
 **/
public class NumDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        Num num = new Num();
        num.x=sc.nextInt();
        num.y=sc.nextInt();
        //调用加法
        int sum = num.add();
        //调用减法
        //int sum = num.sub();
        System.out.println(sum);
    }
}
class Num{
    int x;
    int y;
    //构造器
    public Num(){
    }
    public Num(int x,int y){
        this.x = x;
        this.y = y;
    }
    //加法 重载
    public int add(){
        return x+y;
    }
    public  int add(int x,int y){
        return x+y;
    }
    public  int add(Num num2){
        return this.add(num2.x,num2.y);
    }
    //减法
    public int sub(){
        return x-y;
    }
    public  int sub(int x,int y){
        return x-y;
    }
    public  int sub(Num num2){
        return this.sub(num2.x,num2.y);
    }
}


