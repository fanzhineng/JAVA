package com.fzn2020.day01;

/**
 * @program: JAVA
 * 描述：
 *      while循环
 * @author: fzn
 * @create: 2020-07-20 16:27
 **/
public class WhDemo {
    public static void main(String[] args) {
        int i =1;
        //计算1~100的累加
        int sum = 0;
        while (i<101){
            if (i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);

        //把数倒过来输出 7654321
        int a = 1234567;
        //存放结果
        int res = 0;
        while (a>0){
            int w = a%10;
            res = res*10+w;
            a=a/10;
        }
        System.out.println(res);
    }
}
