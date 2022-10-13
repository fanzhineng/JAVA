package com.day02;

/**
 * @program: JAVA
 * 描述：
 *         计算1~100的累加
 * @author: fzn
 * @create: 2020-07-21 09:35
 **/
public class FDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<101;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        int sum2= add(100);
        System.out.println(sum2);
    }

    //递归调用
    public static int add(int i){
        //要有起始值
        if (i == 1) {
            return 1;
        }else {
            int sum = i+add(i-1);
            return sum;
        }
    }
}
