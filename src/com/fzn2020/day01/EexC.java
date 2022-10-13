package com.fzn2020.day01;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      用do..while完成，猜数字游戏.
 * @author: fzn
 * @create: 2020-07-20 18:39
 **/
public class EexC {
    public static void main(String[] args) {
        //创建随机数 1~100之间
        int a = (int) (Math.random()*100);
        System.out.println(a);
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        do {
            //接收用户输入
            System.out.print("请输入你心所想的数字：");
            int b = sc.nextInt();
            if (b>a){
                System.out.println("猜大了");
            }else if(b<a){
                System.out.println("猜小了");
            }else if (a==b){
                System.out.println("666,猜对了");
                break;
            }
        }while (true);
    }
}
