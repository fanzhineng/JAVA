package com.fzn2020.day02;

import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      用数组完成，成绩管理平台，在控制台中
 *      本班有四人，可录入成绩 显示列表 查询成绩 退出;
 *      1.要把已知的列出来。
 *      2.要自己给自己把操作说明写清楚
 *          1.录入2.显示列表3.查询4.退出
 * @author: fzn
 * @create: 2020-07-21 14:44
 **/
public class Ary5Demo {
    public static void main(String[] args) {
        //四个人的名字
        String[] names = new String[]{"tom","arm","jay","bar"};
        //四个人的成绩
        int[] scores = new int[names.length];
        //可通过一个下标，控制二个数组
        //项目要可一直操作
        Scanner sc = new Scanner(System.in);
        while (true){
            //通过输入序号 来决定进哪个目录
            System.out.print("请输入你想要执行的操作(1.录入2.显示列表3.查询4.退出):");
            int cmd = sc.nextInt();
            if (cmd==1){
                System.out.println("请录入成绩：");
                for (int i=0;i<names.length;i++){
                    System.out.println(names[i]);//输出名字
                    System.out.print("他的成绩是：");
                    scores[i]=sc.nextInt();
                }
            }else if (cmd==2){
                System.out.println("显示成绩列表");
                for (int i=0;i<names.length;i++){
                    System.out.println(names[i]+" "+scores[i]);
                }
            }else if(cmd==3){
                System.out.print("请输入名字查询成绩：");
                String name = sc.next();
                for (int i=0;i<names.length;i++){
                    if (name.equals(names[i])){
                        System.out.println(names[i]+"的成绩是："+scores[i]);
                        break;
                    }else {
                        System.out.println("没有此人！");
                    }
                }
            }else if(cmd==4){
                System.out.println("退出系统");
                break;
            }
        }
    }
}
