package com.day01;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      while 和do-while
 * @author: fzn
 * @create: 2020-07-20 16:59
 **/
public class DoDemo {
    public static void main(String[] args) {
        int i=5;
        while (i<5){//先判断再执行
            System.out.println("a");
        }
        int k =5;
        do{
            System.out.println("b");
        }while (k<5);
        /*
        * 猜数字游戏：
        * 系统先生成整数的随机数，用户在控制台可以不断的输入。
        * 如果猜对了，就输出666
        * 如果猜小了，就输出猜小了
        * 如果猜大了，就输出猜大了
        * 在没有猜对之前可以一直输
        * */
        //生成随机数
        //1.Math.random()0~1之间的随机小数不会到1
        System.out.println((int)(Math.random()*100));
        //2.Random随机数的类
        Random rd = new Random();
        int a = rd.nextInt(101);
        System.out.println(a);//0~100
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入你要猜的数字：");
            int b = sc.nextInt();
            if (b==a){
                System.out.println("你猜对了，游戏结束");
                break;
            }else if (b>a){
                System.out.println("你猜大了");
            }else {
                System.out.println("你猜小了");
            }
        }

    }
}
