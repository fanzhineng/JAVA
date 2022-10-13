package com.fzn2020.day01;

/**
 * @program: JAVA
 * 描述：
 *      for循环的练习
 * @author: fzn
 * @create: 2020-07-20 14:50
 **/
public class ForDemo {
    public static void main(String[] args) {
        /*
        * 有一个女孩喜欢花钱，起初有一笔钱，每天早上起来就开始花钱，
        * 每天花昨天的总量的一半，还不够，还有再花一元。就休息
        * 每天这样花，到了20天，她发现只有一元钱了，问：第一天有多少钱？
        * */
        //最后一天的钱
        int sum =1;
        for (int i=1;i<20;i++){
            sum= (sum+1)*2;
        }
        System.out.println(sum);
        System.out.println("-------");
        //三角形
        for (int i=1;i<5;i++){
            //输出空格
            for (int k=1;k<5-i;k++){
                System.out.print(" ");
            }
            //输出"* "
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
